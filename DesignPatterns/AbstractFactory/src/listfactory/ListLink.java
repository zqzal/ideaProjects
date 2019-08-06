package listfactory;

import factory.Link;

/**
 * Created by xuxi on 2018/11/18.
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "   <li><a href=\""+ url + "\">" + caption + "</a></li>\n";
    }
}
