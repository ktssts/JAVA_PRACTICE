package chapter4_7;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class VariableTypeTest {

    public static String NAME;

    public static int AGE;

    public static boolean FLAG;

    public static void main(String [] args){

        System.out.println(NAME);
        System.out.println(AGE);
        System.out.println(FLAG);

        Student student = new Student();

        student.setAge(10);
        student.setName("小明");

        System.out.println(student.getAge());
        System.out.println(student.getName());

        student.introduce();

    }
}
