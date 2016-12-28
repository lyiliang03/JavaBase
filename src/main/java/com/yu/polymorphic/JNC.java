package com.yu.polymorphic;

/**
 * Created by kevin on 2016/12/27.
 * Java实现多态有三个必要条件：继承、重写、向上转型。
 */
public class JNC extends Wine{
    /**
     * @desc 子类重写父类方法
     *        父类中不存在该方法，向上转型后，父类是不能引用该方法的
     * @param a
     * @return void
     */
    public void fun1(String a){
        System.out.println("JNC 的 Fun1...");
        fun2();
    }

    /**
     * 子类重写父类方法
     * 指向子类的父类引用调用fun2时，必定是调用该方法
     */
    public void fun2(){
        System.out.println("JNC 的Fun2...");
    }
    public static void main(String[] args) {
        Wine a = new JNC();
        a.fun1();
        /*
        Wine 的Fun.....
        JNC 的Fun2...
        */
        /*
        多态我们可以总结如下：
        指向子类的父类引用由于向上转型了，它只能访问父类中拥有的方法和属性，而对于子类中存在而父类中不存在的方法，
        该引用是不能使用的，尽管是重载该方法。若子类重写了父类中的某些方法，在调用该些方法的时候，
        必定是使用子类中定义的这些方法（动态连接、动态调用）。
        */
    }
}