import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Main5 {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner (System.in);
    System.out.println("Введите дату в формате 31.12.2020:");
    String dat = in.nextLine();
    SimpleDateFormat date = new SimpleDateFormat ("dd.MM.yyyy");
    Date data = date.parse(dat); 
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(data);
    calendar.add(Calendar.DAY_OF_MONTH, 45);
    System.out.println("Дата, увеличенная на 45 дней: " + date.format(calendar.getTime()));
    SimpleDateFormat date1 = new SimpleDateFormat ("dd.MM.yyyy");
    calendar.set(Calendar.MONTH, Calendar.JANUARY);
    calendar.set(Calendar.DAY_OF_MONTH, 1);
    System.out.println("Начало года: " + date.format(calendar.getTime()));
        Date data0 = date.parse(dat);
        calendar.setTime(data0);
        int workDays = 0;
        while (workDays < 10) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                workDays++;
            }
        }
        System.out.println("Дата после увеличения на 10 рабочих дней:" + date.format(calendar.getTime()));
        System.out.print("Введите вторую дату в формате dd.MM.yyyy: ");
        String dat1 = in.nextLine();
        Date data2 = date1.parse(dat1);
        Calendar startCal = Calendar.getInstance();
        
        startCal.setTime(data0);
        
        Calendar endCal = Calendar.getInstance();
        endCal.setTime(data2);
        long workingDays = 0;

        while (startCal.before(endCal) || startCal.equals(endCal)) {
            int dayOfWeek = startCal.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
                workingDays++;
            }
            startCal.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println("Количество рабочих дней между введенными датами: " + workingDays);
    }
    }


