package _7_2;

/**
 * Created by xuxi on 2018/11/17.
 */
public class Director7_2 {

    private Builder7_2 builder;
    public Director7_2(Builder7_2 builder7_2){
        this.builder = builder7_2;
    }
    public void construct(){
        builder.makeTitle("Greeting");         //标题
        builder.makeString("从早上至下午");      //字符串
        builder.makeItems(new String[]{"早上好","下午好"}); //条目

        builder.makeString("晚上");           //其他字符串
        builder.makeItems(new String[]{"晚上好","晚安","再见。"}); //其他条目
        builder.close();
    }

}
