import pract2.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            switch (name) {
                case "P" -> programmer();
                case "D" -> driver();
                case "Doc" -> doctor();
            }
        }
    }

    public static void programmer() {

        Programmer programmer1 = new Programmer(1, "Amir Nazarbekov", (byte) 24, 'M', "abbc@gmail.com", "0123456789", 150000, "AUDI A8");
        Programmer programmer2 = new Programmer(2, "Bektur Duyshenbekov", (byte) 21, 'M', "babc@gmail.com", "0123456789", 150000, "MERS E210");
        Programmer programmer3 = new Programmer(3, "Amantur Alymkulov", (byte) 27, 'M', "aabc@gmail.com", "0123456789", 150000, "BMW X6");
        Person[] programmers = new Programmer[]{programmer1, programmer2, programmer2};
        System.out.println(programmer1);
        System.out.println("Favorite Mouth: "+programmer1.favoriteMouth());
        System.out.println("Favorite Sport: "+programmer1.favoriteSport());
        System.out.println("Favorite Language: "+programmer1.favoriteLanguage());
        System.out.println("LastName: "+programmer1.getLastName());
        System.out.println("Date of Brith: "+programmer1.getDateOfBrith());
        System.out.println(programmer2);
        System.out.println("Favorite Mouth: "+programmer2.favoriteMouth());
        System.out.println("Favorite Sport: "+programmer2.favoriteSport());
        System.out.println("Favorite Language: "+programmer2.favoriteLanguage());
        System.out.println("LastName: "+programmer2.getLastName());
        System.out.println("Date of Birht: "+(programmer2.getDateOfBrith()));
        System.out.println(programmer3);
        System.out.println("Favorite Mouth: "+programmer3.favoriteMouth());
        System.out.println("Favorite Sport: "+programmer3.favoriteSport());
        System.out.println("Favorite Language: "+programmer3.favoriteLanguage());
        System.out.println("LastName: "+programmer3.getLastName());
        System.out.println("Date of Birht: "+(programmer3.getDateOfBrith()));
    }
    public static void driver() {
        Driver driver1 = new Driver(11, "Kadyrbek Zhumakanov ", (byte) 20, 'M', "jkabs@gmail.com", "0123456789", 40000, "BMW E 34");
        Driver driver2 = new Driver(11, "Nurlan Sarbagyshev ", (byte) 23, 'M', "sarbs@gmail.com", "0123456789", 30000, "BMW E 39");
        Driver driver3 = new Driver(11, "Kudaibergen Ibraimob  ", (byte) 19, 'M', "ibrabs@gmail.com", "0123456789", 20000, "MERS W124");
        Driver[] drivers = new Driver[]{driver1, driver3, driver2};
        System.out.println(driver1);
        System.out.println(" Favorite Mouth: "+driver1.favoriteMouth()+"\n Favorite Sport: "+driver1.favoriteSport()+"\n Favorite Language: "+driver1.favoriteLanguage());
        System.out.println(" LastName: "+driver1.getLastName()+" \n Date of Birht: "+(driver1.getDateOfBrith()));
        System.out.println(driver2);
        System.out.println(" Favorite Mouth: "+driver2.favoriteMouth()+"\n Favorite Sport: "+driver2.favoriteSport()+"\n Favorite Language: "+driver2.favoriteLanguage());
        System.out.println(" LastName: "+driver2.getLastName()+" \n Date of Birht: "+(driver2.getDateOfBrith()));
        System.out.println(driver3);
        System.out.println(" Favorite Mouth: "+driver3.favoriteMouth()+"\n Favorite Sport: "+driver3.favoriteSport()+"\n Favorite Language: "+driver3.favoriteLanguage());
        System.out.println(" LastName: "+driver3.getLastName()+" \n Date of Birht: "+(driver3.getDateOfBrith()));

    }


    public static void doctor() {
        System.out.println();
        Doctor doctor1 = new Doctor(21, "Taalai Imanaliev", (byte) 32, 'M', "imn@gmail.com", "0123456789", 150000, " BMW X7");
        Doctor doctor2 = new Doctor(22, "Aliza Imanalieva", (byte) 49, 'F', "imn@gmail.com", "0123456789", 170000, " Toyota Prius");
        Doctor doctor3 = new Doctor(22, "Aigul Imanalieva", (byte) 45, 'F', "imn@gmail.com", "0123456789", 130000, " Toyota camry");
        Doctor[] doctors = new Doctor[]{doctor1, doctor2, doctor3};
        System.out.println(doctor1);
        System.out.println(" Favorite Mouth: "+doctor1.favoriteMouth()+"\n Favorite Sport: "+doctor1.favoriteSport()+"\n Favorite Language: "+doctor1.favoriteLanguage());
        System.out.println(" LastName: "+doctor1.getLastName()+" \n Date of Birht: "+(doctor1.getDateOfBrith()));
        System.out.println(doctor2);
        System.out.println(" Favorite Mouth: "+doctor2.favoriteMouth()+"\n Favorite Sport: "+doctor2.favoriteSport()+"\n Favorite Language: "+doctor2.favoriteLanguage());
        System.out.println(" LastName: "+doctor1.getLastName()+" \n Date of Birht: "+(doctor1.getDateOfBrith()));
        System.out.println(doctor3);
        System.out.println(" Favorite Mouth: "+doctor3.favoriteMouth()+"\n Favorite Sport: "+doctor3.favoriteSport()+"\n Favorite Language: "+doctor3.favoriteLanguage());
        System.out.println(" LastName: "+doctor3.getLastName()+" \n Date of Birht: "+(doctor3.getDateOfBrith()));



    }


}