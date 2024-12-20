
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User{
    private String name;
    private LocalDate dob;
    User(){
        name = null;
        dob = LocalDate.now();
    }
    User(String name,int year, int month, int dayOfMonth){
        this.name = name;
        this.dob = LocalDate.of(year, month, dayOfMonth);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setdob(){
        this.dob = dob;
    }
    public String getName(){
        return name;
    }
    public LocalDate getdob(){
        return dob;
    }

    public boolean isBirthday(){
        LocalDate today = LocalDate.now();
        if(dob.getMonth() == today.getMonth() && dob.getDayOfMonth() == today.getDayOfMonth()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void displayInfo(){
        DateTimeFormatter Formatdob = DateTimeFormatter.ofPattern("MMMM,d,YYYY");
        System.out.println(getName() + " was born on " + Formatdob.format(getdob()));
    }

    public void displayHappyBirthday() {
        if(isBirthday()){
            if(getName() == null) System.out.println("Are you kidding me?");
            else System.out.println("Happy birthday " + this.name + "!");
        }
      }
}