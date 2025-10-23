// Escribe una función que reciba una lista de enteros y devuelva la suma de los pares usando Streams.
package uno;

import java.util.concurrent.CompletableFuture;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Ejemplo {

    public static int laSum(List<Integer> listInt) {
        return listInt.stream() // crea el stream
                .filter(i -> i % 2 == 0) // deja solo pares
                .mapToInt(Integer::intValue)
                .sum(); // suma los valores
    }

    public static void main(String[] args) {
        List<Integer> lisInt = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(laSum(lisInt)); // salida: 30
    }
}

final class Person {

    private final String name;
    private final int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}

class InnerEjemplo {

    public static void main(String[] args) {

        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(1, 10);
        myMap.put(2, 20);
        myMap.put(3, 30);

        // Usando forEach con BiConsumer
        myMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

public class EjemploFuture {

    public static void main(String[] args) {

        CompletableFuture.supplyAsync(() -> {
            // tarea en segundo plano
            System.out.println("Leyendo datos...");
            return "datos leídos";
        })
                .thenApply(data -> data.toUpperCase()) // procesamiento
                .thenAccept(result -> System.out.println("Resultado: " + result)); // consumo final

        // evita terminar el programa antes de que el futuro acabe
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }
}



// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;
// import static org.mockito.Mockito.*;

// class Calculator {
//     int sum(int a, int b) { return a + b; }
// }

// class CalculatorTest {

//     @Test
//     void testSum() {
//         Calculator calc = new Calculator();
//         assertEquals(5, calc.sum(2, 3)); // prueba unitaria básica
//     }

//     @Test
//     void testWithMockito() {
//         Calculator mockCalc = mock(Calculator.class);
//         when(mockCalc.sum(2, 3)).thenReturn(10);
//         assertEquals(10, mockCalc.sum(2, 3)); // validando comportamiento simulado
//     }
// }