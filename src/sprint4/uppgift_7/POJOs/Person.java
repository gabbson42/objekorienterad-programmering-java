package sprint4.uppgift_7.POJOs;

public class Person {

    private String name;
    private String number;
    private String birthday;
    private String email;

    public Person() {}

    public Person(String name, String number, String birthday, String email) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
