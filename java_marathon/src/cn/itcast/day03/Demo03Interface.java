package cn.itcast.day03;
//这是一个调用接口实现类的类，但是，不能通过接口实现类的对象来调用接口当中的静态方法；
//使用接口正确的方式是，直接通过调用接口名称调用其中的静态方法
//格式：接口名称.静态方法名称(参数列表)；
public class Demo03Interface {
    public static void main(String[] args){
//        创建实现类对象
            MyInterfaceStaticImpl statixcInter=new MyInterfaceStaticImpl();
            MyInterfaceStatic.MyStaticFn();
    }
}
