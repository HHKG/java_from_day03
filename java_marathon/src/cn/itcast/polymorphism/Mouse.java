package cn.itcast.polymorphism;
//实现USB接口类
public class Mouse implements USB {
    @Override
    public void close() {
       System.out.println("打开鼠标");
    }

    @Override
    public void open() {
        System.out.println("关闭鼠标");
    }
    public void click(){
        System.out.println("点击事件");
    }
}
