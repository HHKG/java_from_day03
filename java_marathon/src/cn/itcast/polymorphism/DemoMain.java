package cn.itcast.polymorphism;

public class DemoMain {
//   首先创建一个笔记本
    public static void main(String [] args){
        Computer computer=new Computer();
        computer.powerOn();

       USB usbMouse=new Mouse();
//       参数是USB类型，我正好传进去的就是USB鼠标；
        computer.useDevice(usbMouse);

//        创建一个USB键盘
        USB usbKeyboard=new Keyboard();
        computer.useDevice(usbKeyboard);

        computer.powerOff();

    }

}
