package pract2;

public abstract class Person implements Personable {
    private int id;
    private String fullName;
    private byte age;
    private char gender;
    private String email;
    private String phoneNumber;
    private long governmentsSalary;
    private String car;

    public Person(int id, String fullName, byte age, char gender, String email, String phoneNumber, long governmentsSalary, String car) {


        this.id = id;

        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.governmentsSalary = governmentsSalary;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public long getGovernmentsSalary() {
        return governmentsSalary;
    }

    public String getCar() {
        return car;
    }

    @Override
    public String toString() {
        return ": " +
                " | id: " + id +
                " | fullName: " + fullName +
                " | age: " + age +
                " | gender:  " + gender +
                " | email:  " + email +
                " | phoneNumber: " + phoneNumber +
                " | governmentsSalary: " + governmentsSalary +
                " | car: " + car + '|' ;
    }
}
