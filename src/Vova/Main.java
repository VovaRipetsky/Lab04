package Vova;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> firstArray = new ArrayList<>();
        ArrayList<Integer> secondArray = new ArrayList<>();

        firstArray.add(1);
        firstArray.add(2);
        firstArray.add(3);
        firstArray.add(9);
        firstArray.add(22);
    // [1,2,3,9,22]

        secondArray.add(5);
        secondArray.add(3);
        secondArray.add(8);
        secondArray.add(8);
        secondArray.add(9);
    // [5,3,8,8,9]

       System.out.println(ArrayOperations.existInBoth(firstArray, secondArray)) ;
       System.out.println(ArrayOperations.areUnique(firstArray, secondArray)) ;

    }
}
