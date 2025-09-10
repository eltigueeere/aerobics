package aerobics.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class Suma {
    // Problema específico:
    // • Tienes un array de enteros ORDENADO: [2, 7, 11, 15]
    // • Tienes un target: 9
    // • Debes encontrar dos números que sumen exactamente 9
    // • Retornar los ÍNDICES de esos números: [0, 1] porque nums[0] + nums[1] = 2 + 7 = 9
    public static int[] getindexs( int[] data){
        int[] indexs = new int[2]; 
        int target = 9;
        HashMap<Integer, Integer> operation = new HashMap<>();
        for (int i=0; i<=data.length-1; i++) {
            int rest = target - data[i];
            if(operation.containsKey(rest)){
                indexs[0] = operation.get(rest);
                indexs[1] = i;
            }
            operation.put(data[i], i);
        }
        return indexs;
    }
    public static void main(String[] args) {
        int[] data = {2,7,11,15};
        int[] resp = getindexs(data);
        System.err.println(Arrays.toString(resp));

    }
    
}
