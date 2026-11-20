
import java.time.LocalDate;

public class Card {
    private static int counter=0;
    private int cardNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private String subscriberType; // "Silver" or "Gold" 

    public Card() {
    }


    public Card( LocalDate startDate, LocalDate endDate,String subscriberType ) {
        this.cardNumber = ++counter;
        this.startDate = startDate;
        this.endDate = endDate;
        this.subscriberType = subscriberType;
    }


    public boolean isExpired() {
         LocalDate today = LocalDate.now();
         return today.isAfter(endDate);
    }

    public static int getCounter() {
        return counter;
    }
      


    public void setStartDate(LocalDate startDate) {
     if (startDate != null) {
        this.startDate = startDate;
    } else {
        System.out.println("Error: Start date cannot be null.");
    }
    }

    public void setEndDate(LocalDate endDate) {
        if (endDate != null) {
        this.endDate = endDate;
    } else {
        System.out.println("Error: end date cannot be null.");
    }
       
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getSubscriberType() {
        return subscriberType;
    }

    public void setSubscriberType(String subscriberType) {
     if (subscriberType != null) {
 
        
        if (subscriberType.equalsIgnoreCase("Gold") || 
            subscriberType.equalsIgnoreCase("Silver") || 
            subscriberType.equalsIgnoreCase("Normal")) {
            
            this.subscriberType = subscriberType;
        } else {
            System.out.println("Invalid Type!");
        }
    } else {
        System.out.println("Subscriber type field cannot be empty!");
    }
    }
    
}
