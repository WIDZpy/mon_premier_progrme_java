package com.raphael;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.raphael.Main;

import static com.raphael.Main.log;
import static com.raphael.Main.randomN;

public class Quicksort {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() != 20000) {
            list.add(randomN());
            // list = Main.supDoublon(list);
        }


        System.out.println(list);

        ArrayList<Integer> sort_list = quicksort(list);

        System.out.println(sort_list);
        log(count(sort_list));
    }

    static ArrayList<Integer> quicksort(ArrayList<Integer> array){
        ArrayList<Integer> newlist = new ArrayList<>();
        int pivo = array.get(array.size()-1);
        array.remove(array.size()-1);
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
    static Map<Integer,Integer> count(ArrayList<Integer> array){
        Map<Integer,Integer> dict = new HashMap<>();

        for (int key: array){
            dict.putIfAbsent(key, 0);
            dict.put(key, dict.get(key) + 1);
        }
        return dict;
    }
}
