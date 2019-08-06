package _7_1;

/**
 * Created by xuxi on 2018/11/17.
 */
public class _7_1Main {

    public static void main(String[] args) {

        _7_1TextBuilder builder = new _7_1TextBuilder();
        _7_1Director director = new _7_1Director(builder);
        director.construct();
        System.out.println(builder.getResult());

        _7_1HTMLBuilder builder1 = new _7_1HTMLBuilder();
        _7_1Director director1 = new _7_1Director(builder1);
        director1.construct();
        System.out.println(builder1.getResult()+"文件存储成功");

    }
}
