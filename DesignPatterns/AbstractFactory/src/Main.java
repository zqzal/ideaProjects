import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;
import listfactory.ListFactory;

public class Main {

    /**
     * 执行文件遇到的坑  步骤执行顺序
     *
     * 1.打开终端（我用的mac  windows应该是cmd）
     * 2.cd 到项目 src目录
     * 
     * 3.输入
     *   javac Main.java listfactory/ListFactory.java
     *   java Main listfactory.ListFactory
     *   返回
     *   LinkPage.html编写完成.
     *   --提示：这个是生成listfactory格式的html
     * 4.输入
     *   javac tablefactory/TableFactory.java
     *   java Main tablefactory.TableFactory
     *   返回
     *   LinkPage.html编写完成
     *   --提示：这个是生成tablefactory格式的html
     *
     */
    public static void main(String[] args) {
	// write your code here
        //通过主程序参数控制具体工厂类型
        if (args.length != 1){
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.LisFactory");
            System.out.println("Example 2: java Main tabelfactory.TableFactory");
            System.exit(0);
        }
        //反射机制需要类的全名（带包名）
        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报","http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报","http://www.gmw.cn/");

        Link test_yahoo = factory.createLink("Yahoo!test","http://www.yahoo.com");
        Link test1_yahoo = factory.createLink("Yahoo!test1","http://www.yahoo.com");
        Link excite = factory.createLink("Excite","http://www.excite.com");
        Link google = factory.createLink("Google","http://www.google.com");

        Tray traynews = factory.createTray("报纸");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayahoo = factory.createTray("Yahoo!");
        trayahoo.add(test_yahoo);
        trayahoo.add(test1_yahoo);

        Tray traysearch = factory.createTray("检索引擎");
        traysearch.add(trayahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage","Test");
        page.add(traynews);
        page.add(traysearch);
        page.output();

    }
}
