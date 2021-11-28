package homework.homeWork6;

public class DivideOpter implements ICompute {

    @Override
    public int computer(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }
}
