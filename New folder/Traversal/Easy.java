// Create an ArrayList with 5 numbers. Print the total number of elements using .size() and also by manually counting with a loop.

import java.util.ArrayList;

public class Easy {

    public static void main(String[] args ){
        ArrayList<Integer> lalo = new ArrayList<>();

        lalo.add(1);
        lalo.add(19);                
        lalo.add(18);            
        lalo.add(17);            
        lalo.add(16);            
        lalo.add(15);            
        lalo.add(14);            
        lalo.add(13);
        int numberOfElements=0;
        for(int i=0; i<=lalo.size()-1; i++){
            numberOfElements++;
        }
        System.out.println("The number or elemnts is " + numberOfElements + "--> " + lalo.size());
    }
}
//   ArrayList = mejor para lectura y acceso rápido.
// Method	Description	Example
// .add(value)	Add element at the end	list.add("Lalo");
// .get(index)	Get element by index	list.get(2);
// .set(i, val)	Replace element at index	list.set(1, "Carlos");
// .size()	Get number of elements	list.size();
// .remove(i)	Remove by index	list.remove(0);
// .clear()	Remove all elements	list.clear();
// .contains()	Check if value exists	list.contains("Lalo");
// .indexOf()	Find index of element	list.indexOf("Carlos");
// .isEmpty()	Check if list is empty	list.isEmpty();
// .add(index, value)	Insert at specific index	list.add(2, "NewItem");
// .remove(object)	Remove by value (first match)	list.remove("Lalo");
// for MIX --> ArrayList<Object> mixedList = new ArrayList<>();