// Create a LinkedList with numbers from 1 to 20. Use a for-each loop to print only the odd numbers.

import java.util.LinkedList;

public class Medium{
    public static void main(String[] args){
        LinkedList<Integer> lalo = new LinkedList<>();
        lalo.add(1);
        lalo.add(2);
        lalo.add(3);
        lalo.add(4);
        lalo.add(5);
        lalo.add(6);
        lalo.add(7);
        lalo.add(8);
        lalo.add(9);
        lalo.add(10);
        for(int n : lalo){
            System.out.println(n);
        }        
    }
}
//   LinkedList = mejor para muchas inserciones/remociones.
// Method	Description	Example
// .add(value)	Add to end	list.add("Lalo");
// .add(index, value)	Insert at index	list.add(1, "Hi");
// .get(index)	Get element at index	list.get(0);
// .set(index, value)	Replace element at index	list.set(2, "Updated");
// .remove(index)	Remove by index	list.remove(1);
// .remove(object)	Remove by value	list.remove("Lalo");
// .contains(obj)	Check if list contains value	list.contains("Carlos");
// .size()	Get number of elements	list.size();
// .clear()	Remove all elements	list.clear();
// .isEmpty()	Check if empty	list.isEmpty();
// .indexOf(obj)	Get index of first match	list.indexOf("Ana");
// for MIX --> ArrayList<Object> mixedList = new ArrayList<>();