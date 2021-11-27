package chapter5_1;

public class LoopTest {

    public static void main(String [] args){

//        test1();
        test2();



    }

    public static void test1(){
        int i = 10;
        while(i<20){

            System.out.println("我是循环被执行"+i);
            i++;

        }
        System.out.println("我是循环i="+i);
    }
    public static void test2(){
        int i = 10;
        do {
            System.out.println("woshi xunhuan beizhixing i="+i);
            i++;
        } while (i<20);
        System.out.println("我是循环i="+i);
    }
}
