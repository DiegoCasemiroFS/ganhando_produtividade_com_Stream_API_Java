import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio02 {

  public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int soma = numeros.stream() // cira uma stream
        .filter(i -> i % 2 == 0) // filtra se eh maior que zero
        .mapToInt(Integer::intValue) // transforma em int para poder utilizar o "sum()"
        .sum(); //soma os valores tipo int

    System.out.println(soma);
  }

}
