package _7_1;

/**
 * Created by xuxi on 2018/11/17.
 */
public class _7_1TextBuilder implements _7_1Buidler {

    private StringBuffer buffer = new StringBuffer(); //文档内容保存在该字段中

    @Override
    public void makeTitle(String title) {              //纯文本的标题

        buffer.append("===========================\n");//装饰线
        buffer.append("⎡" + title + "⎦\n");           //为标题加【】
        buffer.append("\n");                           //换行

    }

    @Override
    public void makeString(String str) {       //纯文本的字符串
        buffer.append('■' + str + '\n');       //为字符串添加■
        buffer.append("\n");                   //换行
    }

    @Override
    public void makeItems(String[] items) {    //纯文本的条目

        for (int i = 0;i < items.length; i++){
            buffer.append("   ."+ items[i] + "\n"); //为条目添加
        }
        buffer.append("\n");                  //换行
    }

    @Override
    public void close() {                       //完成文档
        buffer.append("==========================\n"); //装饰线
    }

    public String getResult(){                  //完成的文档

        return buffer.toString();               //将StringBuffer变换为String

    }

}
