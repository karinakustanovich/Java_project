package lesson14.Basic;

public class InterfaceClass extends ClassForInherit implements BasicInterface, AnotherInterface{
    @Override
    public void sayHello() {
        System.out.println();
    }

//    @Override
//    public int printInfoDefault(int a, int b) {
//        return a + b * 2;
//    }
}
