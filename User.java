package APEX;
/**
 * @author Shaima Fuad
 *
 */
public class User {
    private long ID;
    private String name;
    private String email;
    private String password;
    private DateOfBirth dateOfBirth;

    public User () {
        dateOfBirth = new DateOfBirth();
    }

    public User (long ID,String name,String email, String password, int day,int month, int year ){
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.password = password;
        dateOfBirth = new DateOfBirth(day,month,year);
    }

    //-------------------------------------------------------------------------------------------

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    //------------------------------------------------------------------
/**
 * The function of this method is to verify the email and code to log in
 * @para email Represents the user's email
 * @para password Represents the user's password
 *
 * */
    public void login (String email, String password){
        if (this.email.equals(email) && this.password.equals(password)){
            System.out.println("Login successfully!");
        }
        else
            System.out.println("Invalid credentials.");
    }
    /**
     * This method is used to log out
     *
     */
    public void logout (){
        System.out.println(name + " log out...");
    }

    /**
     * This method is used to reset the password
     * @para newPassword This parameter takes the new password from the user
     */
    public void resetPassword (String newPassword) {
        this.password = newPassword;
        System.out.println("Reset password successfully!");
    }


    /**
     * This method is used to update the profile by changing the name and email
     * @para newName
     * @para newEmail
     * */
    public void updateProfile (String newName, String newEmail) {
         if (newName != null && !newName.isEmpty() && newEmail != null && !newEmail.isEmpty()) {
             this.name = newName;
             this.email = newEmail;
             System.out.println("Profile updated.");
     }
        else
            System.out.println("Something wrong in profile update!");

     }

    @Override
    public String toString() {
        return "ID: " + ID + "\nName: " + name + "\nEmail: " + email +"\nPassword: " + password + "\nDateOfBirth=" + dateOfBirth;
    }
}
