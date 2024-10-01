import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main3 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] number = new int[20];
    Map<Integer, Integer> MapaMap = new HashMap<>();
    for (int i = 0; i < number.length; i ++) {
        int random = (int) (Math.random() * 15);
        number [i] = random; 
    }
    for (int naz : number) {
        MapaMap.put(naz, MapaMap.getOrDefault(naz, 0) +1);
    }
    System.out.println(Arrays.toString(number));
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