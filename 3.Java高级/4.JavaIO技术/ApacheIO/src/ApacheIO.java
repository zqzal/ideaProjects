import org.apache.commons.io.FileUtils;
import org.omg.CORBA.FieldNameHelper;

import java.io.File;
import java.io.IOException;

/**
 * Created by xuxi on 2018/6/3.
 */
public class ApacheIO {
    public static void main(String[] args){
//
//        File file = new File("src/hello.txt");
//        File newfile = new File("src/copyFIle.txt");
//
//        try {
//            FileUtils.copyFile(file,newfile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        File file = new File("src/copyFIle.txt");
        try {
            FileUtils.write(file,"charset","utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
