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
        secondArray.add(5);
        secondArray.add(3);
        secondArray.add(8);


       System.out.println(ArrayOperations.existInBoth(firstArray, secondArray)) ;
       ArrayOperations.clearArray();
       System.out.println(ArrayOperations.areUnique(firstArray, secondArray)) ;

    }
}
