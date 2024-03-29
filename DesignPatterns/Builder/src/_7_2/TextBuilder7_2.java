package _7_2;

/**
 * Created by xuxi on 2018/11/17.
 */
public class TextBuilder7_2 extends Builder7_2 {

    private StringBuffer buffer = new StringBuffer(); //文档内容保存在该字段中

    @Override
    protected void buildTitle(String title) {              //纯文本的标题

        buffer.append("===========================\n");//装饰线
        buffer.append("⎡" + title + "⎦\n");           //为标题加【】
        buffer.append("\n");                           //换行

    }

    @Override
    protected void buildString(String str) {       //纯文本的字符串
        buffer.append('■' + str + '\n');       //为字符串添加■
        buffer.append("\n");                   //换行
    }


    @Override
    protected void buildItems(String[] items) {    //纯文本的条目

        for (int i = 0;i < items.length; i++){
            buffer.append("   ."+ items[i] + "\n"); //为条目添加
        }
        buffer.append("\n");                  //换行
    }


    @Override
    protected void buildDone()  {                       //完成文档
        buffer.append("==========================\n"); //装饰线
    }

    public String getResult(){                  //完成的文档

        return buffer.toString();               //将StringBuffer变换为String

    }
}
