/**
 * Created by xuxi on 2018/6/3.
 */

import java.io.*;

/**
 * 如何使用字符流进行数据读取
 * 如何使用字符流进行数据写入
 *
 * 如何使用字符流进行数据读取
 *
 *
 *
 */
public class UsingStreamReader {
    public static void main(String[] args){
//
//        File file = new File("src/test.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {

            FileInputStream fileInputStream = new FileInputStream("src/test.txt");

            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");

            FileOutputStream fileOutputStream = new FileOutputStream("src/newFile.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");

//
//            char[] chars = new char[100];
//
//            String str="";
//
//            int i;
//
//            while ((i = inputStreamReader.read(chars)) != -1){
//                System.out.println("i========"+i);
//                str += new String(chars,0,i);
//            }


            char[] chars = new char[100];

//            String str="";

            int i;

            while ((i = inputStreamReader.read(chars)) != -1){
                System.out.println("i========"+i);
//                str += new String(chars,0,i);
                outputStreamWriter.write(chars,0,i);
            }
            outputStreamWriter.close();
            fileOutputStream.close();
            inputStreamReader.close();
            fileInputStream.close();
//            System.out.println(str);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
