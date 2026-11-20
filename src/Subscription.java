
import java.util.ArrayList;

public class Subscription {
  

    private String date;
    private Card card;
    private ArrayList<Sport> sports;
    private float totalAmount;

    public Subscription(String date,Card card) {
        this.date = date;
        this.card =card;
        this.sports = new ArrayList<Sport> () ;//يعني ممكن المستخدم يشترك بأكثر من رياضة
        this.totalAmount = (float) 0.0;
    }

    private void calculateTotal() {
       float sum = 0;

        for (Sport s : sports) {
            sum += s.getSubprice();
        }

        if (sports.size() == 2) {
    this.totalAmount = sum * 0.90f;
} 
else if (sports.size() >= 3) {
    this.totalAmount = sum * 0.85f;
} 
else {
    this.totalAmount = sum;
}

    
    }
        public void addSport(Sport sport) {
            if(sport.getNumberOfPlaces()>0){
             sports.add(sport);
            sport.decreasePlace(); 
            calculateTotal();
    } else {
        System.out.println("No places available in " + sport.getName());
    }
    }

    public String getDate() {
        return date;
    }

    public Card getCard() {
        return card;
    }

    public ArrayList<Sport> getSports() {
        return sports;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setDate(String date) {
        if (!date.equals("")) {
            this.date = date;
        }
    }

    public void setCard(Card card) {
            this.card = card;
        
    }

    public void setSports(ArrayList<Sport> sports) {
            this.sports = sports;
        
    }
 
}
