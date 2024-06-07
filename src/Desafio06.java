import java.util.Arrays;
import java.util.List;

public class Desafio06 {

  public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 25, 30, 5, 4, 3);

    numeros.stream()
        .filter(i -> i > 10)
        .forEach(System.out::println);

  }

}
