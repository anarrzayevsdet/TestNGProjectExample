package BasicsTestNG;

public class User {


    public String name;


    private static User user = new User();


    User(){}


    public static User getInstance(){
        return user;
    }


}
