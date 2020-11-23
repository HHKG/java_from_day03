package cn.itcast.day04;
/*
* 使用接口的时候，需要注意
* 1.接口是没有静态代码块或者构造方法的。
* */
public class Demo01Interface {
    public static void main(String[] args){
        MyInterfaceImpl multipleInterface=new MyInterfaceImpl();
        multipleInterface.methodsA();
        multipleInterface.MyInterfaceB();
    }

}
