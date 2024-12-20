public class Main{
    public static void main(String[] args) {

        User user1 = new User("John",1954,2,18);
        user1.displayInfo();
        user1.displayHappyBirthday();

        System.out.println("________________________________________");

        User user2 = new User("John",2004,12,19);
        user2.displayInfo();
        user2.displayHappyBirthday();

        System.out.println("________________________________________");

        User user3 = new User();
        user3.displayInfo();
        user3.displayHappyBirthday();

        System.out.println("________________________________________");

        Admin admin1 = new Admin("Nicolas", 1964, 7, 7);
        admin1.displayHappyBirthday();

        admin1.displayInfo(false);

        System.out.println("________________________________________");

        admin1.displayInfo(true);

        System.out.println("________________________________________");

        Admin admin2 = new Admin("Book", 2004,12,19);
        admin2.displayHappyBirthday();
        System.out.println("________________________________________");


    }
}
