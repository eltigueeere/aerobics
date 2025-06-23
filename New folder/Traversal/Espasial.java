import java.util.HashMap;
import java.util.Map;

public class Espasial {
    public static void main(String[] args) {
        HashMap<Integer, Integer> squares = new HashMap<>();
        // Fill map: key = number, value = square
        for (int i = 1; i <= 10; i++) {
            squares.put(i, i * i);
        }
        System.out.println(squares.get(3));
        // Print entries with odd keys
        for (Map.Entry<Integer, Integer> entry : squares.entrySet()) {
            if (entry.getKey() % 2 != 0) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }
}
// HASMAP<>
// Method	Description	Example
// .put(K, V)	Insert or update a key-value pair	map.put("name", "Lalo");
// .get(K)	Retrieve value for a key	map.get("name");
// .remove(K)	Delete entry by key	map.remove("name");
// .containsKey(K)	Check if key exists	map.containsKey("email");
// .containsValue(V)	Check if value exists	map.containsValue("Mexico");
// .size()	Total number of entries	map.size();
// .clear()	Remove all entries	map.clear();
// .isEmpty()	Check if map is empty	map.isEmpty();
// .keySet()	Get all keys as a Set	Set<K> keys = map.keySet();
// .values()	Get all values as a Collection	Collection<V> vals = map.values();
// .entrySet()	Get all entries (key-value pairs)	for (Map.Entry<K, V> e : map.entrySet())
