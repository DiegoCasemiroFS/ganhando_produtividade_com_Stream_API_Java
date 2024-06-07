import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio04 {

  public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    numeros.stream()
        .filter(i -> i % 2 == 0)
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }

}
