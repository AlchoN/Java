import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Map<Integer, List<User> > MapaMap = new HashMap<>();
        ArrayList<User> myArrayList = new ArrayList<User>();
        String UserName = null;
        int UserAge = 0;
        for (int i = 1; i <= 5; i++ ) {
            System.out.println("Введите имя пользователя " + i + ":");
            UserName = in.nextLine();
            System.out.println("Введите возраст пользователя " + i + ":");
            UserAge = in.nextInt();
            
            User human = new User(UserName, UserAge);
            myArrayList.add(human);
            in.nextLine();
            
        }
        for (int YearsOld : myArrayList) {
            MapaMap.put(YearsOld, MapaMap.getOrDefault(UserAge, myArrayList) );
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