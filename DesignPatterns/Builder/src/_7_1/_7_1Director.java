package _7_1;

/**
 * Created by xuxi on 2018/11/17.
 */
public class _7_1Director {

    private _7_1Buidler buidler;

    public _7_1Director(_7_1Buidler buidler){
        this.buidler = buidler;
    }

    public void construct(){           //编写文档  construct(构建)

        buidler.makeTitle("Greeting");         //标题
        buidler.makeString("从早上至下午");      //字符串
        buidler.makeItems(new String[]{"早上好","下午好"}); //条目

        buidler.makeString("晚上");           //其他字符串
        buidler.makeItems(new String[]{"晚上好","晚安","再见。"}); //其他条目
        buidler.close();              //完成文档
    }

}
