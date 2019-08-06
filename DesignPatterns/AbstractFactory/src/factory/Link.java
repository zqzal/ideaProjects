package factory;

/**
 * Created by xuxi on 2018/11/18.
 */
public abstract class Link extends Item{

    protected String url;

    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
