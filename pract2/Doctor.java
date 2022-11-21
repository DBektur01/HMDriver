package pract2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class Doctor extends  Person{
    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber, long governmentsSalary, String car) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary, car);
    }

    @Override
    public String favoriteSport() {
        Random random = new Random();
        String[]sport={"Footbull","Table Tennis","Basketball"};
        return sport[random.nextInt(sport.length)];

    }

    @Override
    public String favoriteLanguage() {
        Random random = new Random();
        String[]language={"Turkish","English","Russian"};
        return language[random.nextInt(language.length)];
    }
    @Override
    public Month favoriteMouth() {
        Random random = new Random();
        Month[]mouth={Month.APRIL,Month.FEBRUARY,Month.JUNE};
        return mouth[random.nextInt(mouth.length)];
    }
    @Override
    public String getLastName() {
        String[] split = getFullName().split(" ");
        for (String s : split) {
            return split[1];
        }
        return null;
    }

    @Override
    public LocalDate getDateOfBrith() {
        LocalDate date = LocalDate.of(2022, 11, 21);
        date = date.minusYears(getAge());
        return date;
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return getPhoneNumberAndEmail();
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        return new long[0];
    }

    @Override
    public String toString() {
        return "Doctor"+super.toString();
    }
}
