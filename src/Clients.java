import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author 
 */
public class Clients extends Stackeholder{
  private int age;
  private double weight;
   private double height;
   private Card card; 

    public Clients(int age, double weight, double height, String firstName, String lastName, String gender, String phone) {
        super(firstName, lastName, gender, phone);
        this.age = age;
        this.weight = weight;
        this.height = height;
       
        this.card=new Card();
    }
   

    

   

    public int getAge() {
        return age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setAge(int age) {
     if (age >= 15 && age <= 100) {
        this.age = age;
    } else {
        System.out.println("sorry, The entered age is not valid");
    }
    }

    public void setWeight(double weight) {
       if (weight > 0) { 
        this.weight = weight;
        
    
        if (weight >= 100) {
            System.out.println("Don't worry, we are here to help you reach your goal!");
        }
    } else {
        System.out.println("Invalid weight value!");
    }
    }

    public void setHeight(double height) {
      if (height >= 50 && height <= 250) {
        this.height = height;
       
        if (height >= 190) {
            System.out.println("Wow! You have a great height for basketball or swimming.");
        }
    } else {
        System.out.println("Invalid height! Please enter a realistic value in cm.");
    }
    }

 
}
