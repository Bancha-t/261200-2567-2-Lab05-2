
import java.time.LocalDate;

public class Admin extends User {
    Admin(String name,int year, int month, int dayOfMonth){
        super(name,year,month,dayOfMonth);
    }

    @Override

    public void displayInfo(){
        super.displayInfo();
        System.out.println("User type: admin");
        
    }
    public void displayInfo(boolean full){
        if(full){
            displayInfo();
            System.out.println(LocalDate.now());
        } 
        else{
            System.out.println("Name : " + getName());
        }
    }
    public void displayHappyBirthday() {
        int age =   LocalDate.now().getYear() - getdob().getYear();
        if(isBirthday()) {
          System.out.println("Happy birthday " + getName() + "! You are " + age + "!");
        }
      }
}