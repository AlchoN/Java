import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main4 {
    public static void main (String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        Map<String, String>MapaMap = new HashMap();
        System.out.print("Введите строку:");
        String str1 = in.nextLine();
        System.out.println("Введите подстроку:");
        String str2 = in.nextLine();
        int col = countOccurrences(str1, str2);
        System.out.printf("Подстрока %s встречается %d раз %n", str2, col);
        System.out.print("Введите строку:");
        String str3 = in.nextLine();
        String replStr1 = str3.replaceAll( "кака | бяка"," Вырезано цензурой ");
        System.out.println (replStr1);
        System.out.print("Введите дату в формате 'дд.мм.гггг':");
        String str = in.nextLine();
        SimpleDateFormat input = new SimpleDateFormat ("dd.MM.yyyy");
         SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd");
         Date date = input.parse(str);
         String transdate = output.format(date);
        System.out.println(transdate);
        
        }
        private static int countOccurrences(String str1, String str2) {
            int col = 0;
            int index = 0;
    
            while ((index = str1.indexOf(str2, index)) != -1) {
                col++;
                index += str2.length();
            }
    
            return col;
        }
    }

  