public class Sport {
    private static int counter=0;
     private int id;
    private String name;
    private int roomNum;
    private String timing;
    private double subprice ;
    private int  numberOfPlaces;
    private String coachName;

    public Sport( String name, int roomNum, int numberOfPlaces ,String timing,String coachName ,double subprice ) {
        this.id=++counter;
        this.name = name;
        this.roomNum = roomNum;
        this.timing = timing;
        this.subprice = subprice;
        this.numberOfPlaces = numberOfPlaces;
        this.coachName = coachName;
    }

    

    public void decreasePlace() {
        if (numberOfPlaces > 0) {
            this.numberOfPlaces--; 
        }else
            System.out.println("sorry,there are no places!");
        }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
     if (name != null && name.trim().length() >= 2) {
        this.name = name.trim();
    } else {
        System.out.println("Invalid Sport Name! Please enter a valid name.");
    }
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
       if (roomNum > 0 && roomNum <= 50) {
        this.roomNum = roomNum;
    } else {
        System.out.println("Invalid Room Number! Please enter a number between 1 and 50.");
    }
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
      if (timing != null && timing.length() >= 4) {
        this.timing = timing;
    } else {
        System.out.println("Training session time is outside gym hours");
    }
    }

    public double getSubprice() {
        return subprice;
    }

    public void setSubprice(double subprice) {
       if (subprice > 0) {
        this.subprice = subprice;
    } else {
        System.out.println("Invalid Price! The subscription cannot be free or negative.");
    }
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
      if (numberOfPlaces > 0 && numberOfPlaces <= 30) {
        this.numberOfPlaces = numberOfPlaces;
    } else {
        System.out.println("Invalid number of places! Please enter a value between 1 and 30.");
    }
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        if (coachName != null && coachName.trim().length() >= 3) {
        this.coachName = coachName.trim();
    } else {
        System.out.println("Invalid Coach Name! Please enter a real name (at least 3 letters).");
    }
    }
        
  
}
