import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Gnerico {

    public static void main(String[] args) {
        List<Integer>lista = List.of(1, 2, 3, 4, 5);
        lista.forEach(item->{
            System.out.println(item);
        });
        List<String>strings=new ArrayList<>();
        strings.addAll(Arrays.asList("Hola", "Mundo", "Java"));
        strings.forEach(item->{
            System.out.println(item);
        });
    }

    public static String repetir(int veces){
        return IntStream.range(0, veces)
                .mapToObj(i -> "Hola")
                .collect(Collectors.joining());
    }

}
