package _7_3;

import com.company.Director;

import javax.swing.*;

/**
 * Created by xuxi on 2018/11/17.
 */
public class Main7_3 {
    public static void main(String[] args) {
        FrameBuilder frameBuilder = new FrameBuilder();
        Director director = new Director(frameBuilder);
        director.construct();
        JFrame frame = frameBuilder.getResult();
        frame.setVisible(true);
    }
}
