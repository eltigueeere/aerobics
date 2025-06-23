

//Given a sorted array of integers and a target value, return the indices of the two numbers whose sum is equal to the target. 
//Return [-1, -1] if no such pair exists.
// int[] nums = {1, 3, 4, 5, 7, 10, 11};
// int target = 9;
import java.util.ArrayList;

public class EasyT {
    public static void main(String[] args) {
        ArrayList<Integer> lalo = new ArrayList<>();
        lalo.add(1);                
        lalo.add(3);            
        lalo.add(4);            
        lalo.add(5);            
        lalo.add(7);            
        lalo.add(10);
        lalo.add(11);                
        int izq=0, derecha=lalo.size()-1;
        while (izq<derecha) {
            if(lalo.get(izq) + lalo.get(derecha) == 9){
                System.out.println(derecha + " " + izq);
                break;
            } else if(lalo.get(izq) + lalo.get(derecha) > 9){
                derecha--;
            } else{
                izq++;
            }
        } 
    }
}