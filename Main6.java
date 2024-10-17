import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите имя первого пользователя:");
    String UserName = in.nextLine();
    System.out.println("Введите возраст первого пользователя:");
    int UserAge = in.nextInt();
    User human = new User(UserName, UserAge);
    in.nextLine();
    System.out.println("Введите имя второго пользователя:");
    String UserName2 = in.nextLine();
    System.out.println("Введите возраст второго пользователя:");
    int UserAge2 = in.nextInt();
    User human2 = new User(UserName2, UserAge2);
    if (UserAge>UserAge2) {
        System.out.println(human2.toString());
    }
    else if (UserAge2>UserAge) {
        System.out.println(human.toString());
    }
        
    }
}

class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name =  name;
        this.age = age;
     }
    public void setName(String UserName){
        name = UserName;
        
    }
    public String getName(){
        return name;
    }
    public void setAge(int UserAge) {
        age = UserAge;
    }
    public int getAge() {
        return age;
    }

    public String toString() {
        return (name + "," + " возраст " + age + " лет");

    }
}
