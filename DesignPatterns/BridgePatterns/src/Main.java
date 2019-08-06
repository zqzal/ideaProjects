import com.xuxi.bridgems.LGTvControl;
import com.xuxi.bridgems.SonyTvControl;

/**
 * Bridge 桥接者模式
 *  桥接模式：将实现和抽象放在两个不同的类层次中，使两个层次可以独立改变
 */

public class Main {
    public static void main(String[] args) {
        LGTvControl lgTvControl = new LGTvControl();
        SonyTvControl sonyTvControl = new SonyTvControl();

        lgTvControl.Onoff();
        lgTvControl.nextChannel();
        lgTvControl.nextChannel();
        lgTvControl.preChannel();
        lgTvControl.Onoff();

        sonyTvControl.Onoff();
        sonyTvControl.nextChannel();
        sonyTvControl.nextChannel();
        sonyTvControl.preChannel();
        sonyTvControl.Onoff();
    }
}
