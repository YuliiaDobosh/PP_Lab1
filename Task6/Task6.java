package Task6;

import java.sql.SQLOutput;

public class Task6 {
    public static void main(String[] args) {
        User user1 =new User("Юлія" , "Добош ", 18 , "yuliadoboshua2004@gmail.com");
        User user2 =new User("Дзвіна" , "Кулич", 19 , "dzvinaua2004@gmail.com");
        System.out.println("hashCode for user1 = " + user1.hashCode());
        System.out.println("hashCode for user2 = " + user2.hashCode());
        System.out.println(user1+" == "+ user2+ user1.equals(user2));
        System.out.println(user1.equals(user2));
    }
}
