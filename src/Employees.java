public class Employees extends Stackeholder{
   private String username;
   private String password;

    public Employees(String username, String password, String firstName, String lastName, String gender, String phone) {
        super(firstName, lastName, gender, phone);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
      if (username != null && username.length() >= 4 && !username.contains(" ")) {
        this.username = username;
    } else {
        System.out.println("Invalid Username! Must be at least 4 characters and contain no spaces.");
    }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
     if (password != null && password.length() >= 6) {
        this.password = password;
    } else {
        System.out.println("Weak Password! It must be at least 6 characters long.");
    }
    }

}
