package homework.homeWork6;

/**
 * 写一个计算器，能完成加减乘除运算
 * 定义接口做参数
 * 加减乘除定义4个类
 * 定义一个静态工具类，把下面的接口作为其中一个形参对象，传递具体的运算符类完成计算
 *
 * 解题思路
 * 创建interface ICompute,留下computer方法可以输入num1 num2；
 * 创建实现ICompute接口的4个类，加减乘除，各自完成对应功能。
 * 制作一个静态工具类，将Icompute接口入参，同时入参变量num1，num2，返回IComputer的接口方法
 * 最后生成main方法，调用静态工具方法，然后直接入参加减乘除实例类并输入num1数值和num2数值

 */


public class Main {

    public static void compute (ICompute compute, int num1, int num2){

        int result = compute.computer(num1,num2);
        System.out.println(result);

    }

    public static void main(String[] args) {
        Main.compute(new AddOpter(),26,24);
        Main.compute(new SubOpter(),26,24);
        Main.compute(new MultOpter(),26,24);
        Main.compute(new DivideOpter(),26,24);
    }

}
