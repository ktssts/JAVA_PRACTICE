package homework.homeWork5;


import java.util.Arrays;

/**
 * 作业1： 知识点：数组，循环，if，边界
 * 创建100个学生对象，id编号为1~100
 * 把编号可以大于60的归为二组，其他的归为一组
 *
 */

/**
 * 知识点: switch
 * 定义一个⽅方法，给1~4其中⼀个数字，返回春夏秋冬 字符串，不命中则返回 错误季节
 */

/**
 *知识点 static ，数组， 循环
 *
 定义⼀个Dog类，⾥面含有 age 静态变量初始为 10，有⼀个name成员属性 , 有⼀个
 *changeAge⽅法，使age自增1， 创建含5个dog的数组，获取数组⻆标为3的dog对象,调⽤两
 * 次changeAge⽅方法，最后打印5个dog对象的age分别是多少
 */





public class HomeWorkMain {

    public static void main(String [] args){
//        test1();
//        test2();
        test3();
    }

    public static void test1(){
        Student[] arr1 = new Student[60];
        int arr1Index = 0;

        Student[] arr2 = new Student[40];
        int arr2Index = 0;

        for (int i =0 ; i<100; i++){
            int num =i+1;
            Student student = new Student();
            student.setId(num);

            if (num<61) {
                arr1[arr1Index] = student;
                arr1Index++;
            }else{
                arr2[arr2Index] = student;
                arr2Index++;
            }
        }
        for (Student s : arr1){
            System.out.println(s.getId());
        }
        System.out.println("===============");

        for (Student s : arr2){
            System.out.println(s.getId());
        }
    }

    public static void test2(){

        int season = 10;
        String content;

        switch (season){
            case 1:content = "春";
                break;
            case 2 : content = "夏";
                break;
            case 3 : content = "秋";
                break;
            case 4 : content = "冬";
                break;
            default :content ="错误季节";
        }
        System.out.println(content);

    }

    public static void test3(){

        Dog[] dogs = new Dog[5];

        for (int i = 0; i<5;i++){
            Dog dog = new Dog();
            dog.setName(("wangcai "+i));
            dogs[i]=dog;
        }

        Dog dog = dogs[3];
        dog.changeAge();
        dog.changeAge();

        for(Dog d:dogs){

            System.out.println("mingcheng ="+d.getName() + ",age=" + d.getAge());

        }



    }


}
