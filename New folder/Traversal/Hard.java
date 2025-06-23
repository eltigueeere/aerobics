// Create an ArrayList with any 5 elements. Swap the first and last elements manually (do not use built-in swap methods). Print the list after the change.

import java.util.ArrayList;

public class Hard{
    public static void main(String[] args){
        ArrayList<Integer> lalo = new ArrayList<>();
        lalo.add(1);                
        lalo.add(2);                
        lalo.add(3);            
        lalo.add(4);            
        lalo.add(5);            
        System.out.println(lalo);
        int change = lalo.get(0);
        lalo.set(0, lalo.get(lalo.size()-1));
        lalo.set(lalo.size()-1, change);
        System.out.println(lalo);
    }
}