package Losson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Generics<T> {

    public static <T> T[] changeTwoElementsOfArray(T[] arr, int first, int second){
        T reservedFirstElement = arr[first];
        arr[first] = arr[second];
        arr[second] = reservedFirstElement;

        return arr;
    }


    public ArrayList<T> arrayToList(T[] arr){

        return new ArrayList<>(Arrays.asList((arr)));
    }





}
