package Fpipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Pipeline_demo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        // Map é a operação intermediaria, ele cria uma nova stream baseado na expressão lambda descrita
        // Cada elemento da nova stream, sera o elemento original multiplicado por 10.
        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        // O toArray é uma operação terminal
        System.out.println(Arrays.toString(st1.toArray()));

        // Faz o somatorio da minha lista - 0 é o elemento neutro da soma
        // Se eu fosse fazer multiplicação, no lugar do 0 seria 1, que é o elemento neutro da multiplicação
        // Reduce é uma operação terminal.
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = "+ sum);

        // filter recebe um predicate
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
