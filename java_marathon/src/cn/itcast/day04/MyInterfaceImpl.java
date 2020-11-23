package cn.itcast.day04;

public class MyInterfaceImpl implements MyInterface,MyInterfaceB{
    @Override
    public void methodsA() {
        System.out.println("我是实现接口MyInterface");
    }

    @Override
    public void MyInterfaceB() {
        System.out.println("我是实现接口MyInterfaceB");

    }
}
