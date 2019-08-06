package listfactory;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/**
 * Created by xuxi on 2018/11/18.
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
