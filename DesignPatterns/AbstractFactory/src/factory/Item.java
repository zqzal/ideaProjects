package factory;

/**
 * Created by xuxi on 2018/11/18.
 */
public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }
    public abstract String makeHTML();
}
