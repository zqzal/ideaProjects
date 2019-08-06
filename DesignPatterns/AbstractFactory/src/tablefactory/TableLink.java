package tablefactory;

import factory.Link;

/**
 * Created by xuxi on 2018/11/21.
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a hre=\"" + url + "\"" + caption + "</a></td>\n";
    }
}
