package cn.itcast.day03;
/*
这是一个接口
* 从java8开始，街口允许定义静态方法；
* 格式：
* public static 返回值类型 方法名称(参数列表){
*       方法体；
* }
* 提示：就是将abstract或default替换成static；
* */
public interface MyInterfaceStatic {
    public static  void MyStaticFn(){
        System.out.println("您现在调用的是接口的静态方法");
    }
}
