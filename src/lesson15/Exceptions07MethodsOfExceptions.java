package lesson15;

public class Exceptions07MethodsOfExceptions {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
//            array[57] = 67;
            divide(5, 0);
        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("===========");
            System.out.println(e.toString());

        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static int divide(int a, int b){
        return a / b;
    }
}

