package lesson8;

import java.util.Arrays;

public class AreArraysEqual {
    public static void main(String[] args) {

        int[] arr1 = {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};
        int[] arr2 = {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};

        System.out.println(arrMyEquals(arr1, arr2));
        System.out.println(arrEquals(arr1, arr2));
    }

    public static boolean arrMyEquals(int[] array1, int[] array2){

        boolean res = false;

        if(array1.length == array2.length){
            for (int i =0; i <= array1.length; i++){
                if (i < array1.length){
                    if (array1[i] != array2[i]){
                        res = false;
                        break;
                    }
                }else{
                    res = true;
                }
            }
        }else{
            res = false;
        }
        return res;
    }
    public static boolean arrEquals(int[] array1,int[] array2){

        return Arrays.equals(array1, array2);
    }
}