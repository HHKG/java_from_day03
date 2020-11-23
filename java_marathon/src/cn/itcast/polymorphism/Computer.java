package cn.itcast.polymorphism;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
//    使用设备
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.click();
        }
        if(usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }
}
