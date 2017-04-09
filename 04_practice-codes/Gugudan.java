import java.util.stream.IntStream;
import java.util.stream.Collector;

class Gugudan {
    public static void main(String[] args) {

        for(int y = 2; y < 10; y += 1) {
            if(y % 2 == 0) {
                for(int i=1; i < 10; i += 1 ) {
                    System.out.print(y + " X " + i + " = " + (y * i) + " ");
                }
                System.out.println("");
            }
        }

        String template = "%d X %d = %d";
        String.format(template, 1, 2, 2);
/*
        IntStream.range(2,10).mapToObj(a -> 
            .filter(a -> a % 2 == 0);
            IntStream.range(1,10).mapToObj(b -> 
            String.format(template, a, b, a * b))
        ).forEach(System.out::println);
        // a -> System.out.println(a);
*/
    }  
}