/**
 * Created by przemyslawm on 2017-04-26.
 */

public class MainProgram {
    public static void main(String[] args)
    {
        User user = new User("Paweł", "Rak");
        user.getUser();
        user.setUser("Raweł", "Pack");
        user.calculatedValue(4, 5);
        user.getUser();
    }


//    user.setUser("Elo", "Kaczyński");
}
