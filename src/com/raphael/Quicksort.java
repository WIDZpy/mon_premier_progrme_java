package com.raphael;

import java.util.ArrayList;
import java.util.Arrays;
import com.raphael.Main;

import static com.raphael.Main.randomN;

public class Quicksort {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() != 100) {
            list.add(randomN());
            list = Main.supDoublon(list);
        }
        System.out.println(list);

        System.out.println(quicksort(list));
    }

    static ArrayList<Integer> quicksort(ArrayList<Integer> array){
        ArrayList<Integer> newlist = new ArrayList<>();
        int pivo = array.get(array.size()-1);
        array.remove(array.size()-1);
        System.out.println('a');
        ArrayList<Integer> moin = new ArrayList<>();
        ArrayList<Integer> plus = new ArrayList<>();


        for (int curseur: array){
            if (curseur <= pivo){
                moin.add(curseur);
            }
            else {
                plus.add(curseur);
            }
        }
        plus.add(0,pivo);

        System.out.println(moin.size());
        System.out.println(plus.size());





        if (moin.size()<=1){
            newlist.addAll(moin);
        }
        else {
            newlist.addAll(quicksort(moin));
        }
        if (plus.size()<=2) {
            newlist.addAll(plus);
        }
        else {
            newlist.addAll(quicksort(plus));

        }
        return newlist;
    }
}
