// You are given two sorted arrays A and B, and a target integer.
// Return the pair (a, b) such that:
// a is from A, b is from B
// The sum a + b is the closest possible to the target
// If multiple pairs have the same closest sum, return the one with the smallest a, then b
// A = [1, 4, 5, 7]
// B = [10, 20, 30, 40]
// target = 32

import java.util.ArrayList;
import java.util.Collections;

public class MediumT{
    public static void main(String[] args) {
        ArrayList<Integer> lisA = new ArrayList<>();
        lisA.add(1);
        lisA.add(4);
        lisA.add(5);
        lisA.add(7);
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(10);
        listB.add(20);
        listB.add(30);
        listB.add(40);
        int listShort=0, listLarge=0;
        if(lisA.size() < listB.size()){
            listShort = lisA.size()-1;
            listLarge = listB.size()-1;
        } else{
            listShort = listB.size()-1;
            listLarge = lisA.size()-1;
        }
        Collections.sort(lisA);
        Collections.sort(listB);
        int izq=0, dere=listLarge;
        while (izq<dere && izq<lisA.size()) {
            if((lisA.get(izq) + listB.get(dere)) > 29 && (lisA.get(izq) + listB.get(dere)) <= 32){
                System.out.println(izq +"  " + dere);
                System.out.println("se encontro " + lisA.get(izq) + "  " +  listB.get(dere) );
                break;
            } else if( (lisA.get(izq) + listB.get(dere)) > 32  )  {
                dere--;
            } else{
                izq++;
            }
        }

    }
}