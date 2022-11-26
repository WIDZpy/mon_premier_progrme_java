package com.raphael;


        import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ArrayList<Integer> newlist = new ArrayList<>();
        ArrayList<Integer> newlist1 = new ArrayList<>();

        newlist.add(1);
        newlist1.add(2);
        newlist.addAll(newlist1);

        System.out.println(newlist);
        /*
        int a = 0;
        int n = randomN();
        boolean T = true;
        ArrayList<Integer> list = new ArrayList<Integer>();


        // for (int i = 0; i < 100; i++) {
        //     a++;
        //     System.out.println(i);
        // }
        // for (int j : array) {
        //     System.out.println(j);
        // }
        // System.out.println(a);

        while (list.size() != 100) {
            list.add(randomN());
        }

        System.out.println(supDoublon(list));
        */
    }

    static int randomN(){
        return (int) ((Math.random()*((100-1)+1)));
    }

    static void print(String msg){
        System.out.println(msg);
    }

    static void print(int msg){
        System.out.println(msg);
    }

    static ArrayList<Integer> supDoublon(ArrayList<Integer> array){
        ArrayList<Integer> newlist = new ArrayList<>();
        for (int t: array){
            if (!newlist.contains(t)){
                newlist.add(t);
            }
        }
        return newlist;
    }

    static ArrayList<Integer> quicksort(ArrayList<Integer> array){
        ArrayList<Integer> newlist = new ArrayList<>();
        int pivo = array.get(array.size()-1);
        array.remove(array.size()-1);

        ArrayList<Integer> moin = new ArrayList<>();
        ArrayList<Integer> plus = new ArrayList<>();


        for (int curseur: array){
            if (curseur < pivo){
                moin.add(curseur);
            }
            else if (curseur > pivo){
                plus.add(curseur);
            }
        }

        return newlist;
    }
    static void log(Object msg){
        System.out.println(msg);
    }
}
