package factory;

import java.util.ArrayList;

/**
 * Created by xuxi on 2018/11/18.
 */
public abstract class Tray extends Item{

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item){
        tray.add(item);
    }
}
