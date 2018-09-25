package Vova;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayOperations {
    private static ArrayList<Integer> c = new ArrayList<>();
    private static ArrayList<Integer> d = new ArrayList<>();
    protected static ArrayList<Integer> existInBoth(ArrayList<Integer> a, ArrayList<Integer> b){

        for(int i=0; i<a.size(); i++){
            for(int j=0; j<a.size(); j++){
                if (a.get(i) == b.get(j)){
                c.add(a.get(i));
                }
            }
        }
        return c;
    }

    protected static ArrayList<Integer> areUnique(ArrayList<Integer> a, ArrayList<Integer> b){

        ArrayList<Integer> concatList = new ArrayList<>();
        ArrayList<Integer> unique = new ArrayList<>();
        concatList.addAll(a);
        concatList.addAll(b);
        Collections.sort(concatList);
        for(int i=0; i<concatList.size();i++){

            if(i == 0){
                if (concatList.get(0) != concatList.get(1)){
                    unique.add(concatList.get(0));
                }
            }
            else if(i == concatList.size()-1) {
                if (concatList.get(concatList.size()-1) != concatList.get(concatList.size()-2)){
                    unique.add(concatList.get(concatList.size()-1));
                }
            }
            else if(i > 0 && i<concatList.size()-1){
                if (concatList.get(i) != concatList.get(i+1) && concatList.get(i) != concatList.get(i-1)){
                    unique.add(concatList.get(i));
                }
            }
        }


     return unique;
    }

    protected static void clearArray(){
        c.clear();
    }
}
