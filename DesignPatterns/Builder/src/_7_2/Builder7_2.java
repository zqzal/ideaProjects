package _7_2;

/**
 * Created by xuxi on 2018/11/17.
 */
public abstract class Builder7_2 {
    private boolean initialized = false;
    public void makeTitle(String title){
        if (!initialized){
            buildTitle(title);
            initialized = true;
        }
    }
    
    public void makeString(String str){
        if (initialized){
            buildString(str);
        }
    }
    
    public void makeItems(String[] items){
        if (initialized){
            buildItems(items);
        }
    }

    public void close(){
        if (initialized){
            buildDone();
        }
    }

    protected abstract void buildTitle(String title);
    protected abstract void buildString(String str);
    protected abstract void buildItems(String[] items);
    protected abstract void buildDone();
}
