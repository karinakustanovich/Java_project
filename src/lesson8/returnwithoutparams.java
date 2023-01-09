package lesson8;

import java.util.Date;

public class returnwithoutparams {
    public static void main(String[] args) {

        long randomNumber = getRandomNumber();
        System.out.println("randomNumber = " + randomNumber);
        System.out.println(getRandomNumber());

        System.out.println(getRandomNumber());
    }

//    1_673_285_864_407
//    1_673_285_904_950

        public static long getRandomNumber() {
        Date date = new Date();
//        long currentDate = date.getTime();

        return date.getTime();

        }
}
