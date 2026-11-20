public class Stackeholder {
  private String firstName;
   private String lastName;
   private String gender;
   private String phone;

    public Stackeholder(String firstName, String lastName, String gender, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length()>5) 
            this.firstName= firstName.replace("a", "");
       else 
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.startsWith("h"))
        this.lastName = lastName.toUpperCase();
        else 
             this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender != null){
        this.gender = gender;
    }
        else {
            System.out.println("Please enter 'Male' or 'Female'.");}
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
     if (phone != null && phone.length() == 10 && phone.startsWith("09")) {
        this.phone = phone;
    } else {
        System.out.println("Invalid Phone Number! It must be 10 digits and start with 09.");
    }
    }

}
