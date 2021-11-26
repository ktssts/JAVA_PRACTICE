package chapter4_2.chapter4_2_2;

public class Student {

    public void learn(){
        System.out.println("xuexi");

        Dog dog = new Dog();
        dog.mongmong();

        Cat cat = new Cat();
        cat.miaomiao();


    }

}

class Cat{
    public void miaomiao(){
        System.out.println("miaomiao!!");
    }
}

class Dog{
    public void mongmong(){
        System.out.println("mongmong!!");
    }
}