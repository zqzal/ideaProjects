package _7_3;

import com.company.Builder;
import javafx.scene.control.Alert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by xuxi on 2018/11/17.
 */
public class FrameBuilder extends Builder {

    private JFrame frame = new JFrame();
    private Box box = new Box(BoxLayout.Y_AXIS);

    @Override
    public void makeTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void makeString(String str) {
        box.add(new JLabel(str));
    }

    @Override
    public void makeItems(String[] items) {

        Box innerbox = new Box(BoxLayout.Y_AXIS);
        for (int i=0; i<items.length;i++){

            JButton button = new JButton(items[i]);
//            button.addActionListener((ActionListener) this);
            ///////自己添加的Alert
            String itemString = items[i];
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, itemString, itemString, JOptionPane.ERROR_MESSAGE);
                }
            });
            ////////
            innerbox.add(button);
        }
        box.add(innerbox);
    }

    @Override
    public void close() {
        frame.getContentPane().add(box);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                System.exit(0);
            }
        });
    }

    public JFrame getResult(){
        return frame;
    }

    public void actionPerformed(ActionEvent e){
        System.out.println(e.getActionCommand());
    }


}
