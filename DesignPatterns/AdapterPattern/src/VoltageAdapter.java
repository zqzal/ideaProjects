/**
 * Created by xuxi on 2018/9/30.
 */
public class VoltageAdapter extends Voltage220 implements Voltage5{
    @Override
    public int output5V() {
        int src = output220V();
        System.out.println("适配器工作开始适配电压");
        int dst = src/14;
        System.out.println("");
        return 0;
    }
}
