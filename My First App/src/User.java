/**
 * Created by przemyslawm on 2017-04-26.
 */
public class User {

    private String First_name;
    private String Last_name;
    private String Mail;

    private void setMail(){
        this.Mail = First_name + "." + Last_name + "@company.com";
        this.Mail = this.Mail.toLowerCase().trim()
    }

    public String getMail() {
        System.out.println(this.Mail);
        return this.Mail;
    }

    public void getUser() {
        System.out.println(First_name + " " + Last_name);
    }


    public void setUser(String first_name, String last_name) {
        this.First_name = first_name;
        this.Last_name = last_name;

    }

    public int calculatedValue(int repetitions, int period) {
        return repetitions * period;
    }

    public User(String first_name, String last_name) {
        this.First_name = first_name;
        this.Last_name = last_name;
        setMail();
    }


}


