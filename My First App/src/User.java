/**
 * Created by przemyslawm on 2017-04-26.
 */
public class User {

    private String First_name;
    private String Last_name;
    private String Mail;
    private int Salary = 2000;

    private void setMail() {
        this.Mail = First_name + "." + Last_name + "@company.com";
        this.Mail = this.Mail.toLowerCase().trim();
    }

    public String getMail() {
        System.out.println(this.Mail);
        return this.Mail;
    }

    public void getUser() {
        System.out.println(First_name + " " + Last_name);
        System.out.print(String.format("Salary: %d", this.Salary));
    }


    public void setUser(String first_name, String last_name) {
        this.First_name = first_name;
        this.Last_name = last_name;

    }

    public int calculateSalary(int repetitions, int period) {
        this.Salary = this.Salary * repetitions * period;
        System.out.println(this.Salary);
        return this.Salary;
    }

    public User(String first_name, String last_name) {
        this.First_name = first_name;
        this.Last_name = last_name;
        setMail();
    }

    public User(String first_name, String last_name, int salary) {
        this.First_name = first_name;
        this.Last_name = last_name;
        this.Salary = salary;
        setMail();
    }
}


