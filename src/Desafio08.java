import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio08 {

  public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int soma = numeros.stream() // cira uma stream
        .mapToInt(Integer::intValue) // transforma em int para poder utilizar o "sum()"
        .sum(); //soma os valores tipo int

    System.out.println(soma);


  }

}
