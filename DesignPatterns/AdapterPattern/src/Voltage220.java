/**
 * Created by xuxi on 2018/9/30.
 */
//src->Adapter->dst中，即datas->Adapter->View.

/**
 * src
  */
public class Voltage220 {

    public int output220V(){
        int src =  220;
        System.out.println("我是"+ src + "V");
        return src;
    }

}
