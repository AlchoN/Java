import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Какую операцию будем выполнять? (Выберите число, соответствующее операции) \n 1)Считать потоком ввода три числа и сохранить их в целочисленных переменных a, b и c \n 2)Вывести на консоль переменные, значения которых делятся на 5 \n 3)Вывести на консоль значение от целочисленного деления a на b \n 4)Вывести на консоль значение от деления a на b \n 5)Вывести на консоль значение от деления a на b, округленного до ближайшего целого в большую сторону \n 6)Вывести на консоль значение от деления a на b, округленного до ближайшего целого в меньшую сторону \n 7)Вывести на консоль значение от деления a на b, округленного до ближайшего целого математическим округлением \n 8)Вывести на консоль остаток от деления b на c \n 9)Вывести на консоль наименьшее значение из a и b \n 10)Вывести на консоль наибольшее значение из b и c \n");
        System.out.print ("Выберите операцию: ");
        int z = in.nextInt();

        if (z == 1) {
            System.out.println("Введите 3 числа ");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.printf("a = %d; b = %d; с = %d", a, b, c);
        }

        if (z == 2) {
            System.out.println("Введите 3 числа ");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
           if (a % 5 == 0 && b % 5 == 0 && c % 5 == 0){
            System.out.printf ("a = " + a + " b = " + b + " с = " + c);
           }
          else if (a % 5 == 0 && b % 5 == 0 && c % 5 != 0) {
            System.out.printf ("a = " + a + " b = " + b);

          }
          else if (a % 5 == 0 && b % 5 != 0 && c % 5 == 0) {
            System.out.printf ("a = " + a + " с = " + c);

          }

          else if (a % 5 != 0 && b % 5 == 0 && c % 5 == 0) {

            System.out.printf (" b = " + b + " с = " + c);
          }

          else if (a % 5 != 0 && b % 5 != 0 && c % 5 != 0) {

            System.out.printf ("нет значений, кратных 5");
          }
           }
        

        if (z == 3) {
        System.out.println("Введите 3 числа ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int del = a / b;
        System.out.printf("Результат целочисленного деления a на b: %d", del);
    }
        else if (z == 4) {
        System.out.println("Введите 3 числа ");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        double del1 = a / b;
        System.out.printf("Результат целочисленного деления a на b: %f", del1);
    }

    else if (z == 5) {
        System.out.println("Введите 3 числа ");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        double del1 = a / b;
        Math.ceil(del1);
        System.out.println("Результат целочисленного деления a на b: " + Math.ceil(del1));
    }

    else if (z == 6) {
        System.out.println("Введите 3 числа ");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        double del1 = a / b;
        Math.floor(del1);
        System.out.println("Результат целочисленного деления a на b: " + Math.floor(del1));
    }

    else if (z == 7) {
        System.out.println("Введите 3 числа ");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        double del1 = a / b;
        Math.round(del1);
        System.out.println("Результат целочисленного деления a на b: " + Math.round(del1));
    }
        
    else if (z == 8) {
        System.out.println("Введите 3 числа ");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        double del1 = a / b;
        del1 = a % b;
        System.out.printf("Результат целочисленного деления a на b: %f ", del1);
    }

    else if (z == 9) {
       System.out.println ("Введите a и b: "); 
       int a = in.nextInt();
       int b = in.nextInt();
       if (a<b) {
        System.out.println ("Переменная a меньше. Переменная a = " + a + " Переменная b = " + b);
       }

       else if (a>b) {
        System.out.printf ("Переменная b меньше. Переменная a = " + a + " Переменная b = " + b);
       }
    }

    else if (z == 10) {
        System.out.println ("Введите a и b: ");
        int b = in.nextInt();
        int с = in.nextInt();
        if (b<с) {
         System.out.printf ("Переменная с больше. Переменная b = " + b + " Переменная с = " + с);
        }

        else if (b>с) {
         System.out.printf ("Переменная b больше. Переменная b = " + b + " Переменная с = " + с);
        }
     }
        in.close();
    }
}
