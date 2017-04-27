import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by przemyslawm on 2017-04-26.
 */

public class MainProgram {

    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        User user = new User("Paweł", "Rak");
        User user2 = new User("Paweł", "Popiela", 2000);

        ArrayList<User> usersList = new ArrayList<>(32);

        usersList.add(user);
        usersList.add(user2);

        HashMap<String, User> userDict = new HashMap<>();


        for (int i = 0; i < usersList.size(); i++) {
            User cur_user = usersList.get(i);

            cur_user.calculateSalary(4, 10);
            cur_user.getUser();

            userDict.put(String.format("Num %d", i), cur_user);

        }
        System.out.println(usersList.size());

    }



//    user.setUser("Elo", "Kaczyński");
}
