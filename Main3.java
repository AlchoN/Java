import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
public class Main3 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] number = new int[20];
    Random random = new Random();
    Map<Integer, Integer> MapaMap = new HashMap<>();
    for (int i = 0; i < number.length; i ++) {
        number [i] = random.nextInt(15) + 1;
    }
    for (int naz : number) {
        MapaMap.put(naz, MapaMap.getOrDefault(naz, 1) +1);
    }
    System.out.println( Arrays.toString(number));
   for (Map.Entry<Integer, Integer>entry : MapaMap.entrySet() ) {
    if(entry.getValue() > 1){
 System.out.println("Число " + entry.getKey() + " Встречается " + entry.getValue() + " раза");
    }
    else if (entry.getValue() == 1){
        in.close();
    }
   }
}
}