package stock_system2;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    ArrayList<User> user;

    public static void main(String[] args) {
        Login login = new Login();
        login.user = login.getUser();
        while (true)
            login.checkDetails();
    }

    public ArrayList<User> getUser(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Spencer", "Howe", true, 001, "spenny", "password"));
        users.add(new User("Beyonce", "Knowles", true, 003, "lemonade_gurlz", "hotsauce"));
        users.add(new User("Kanye", "West", false, 666, "abso_nutjob", "kanye4preZ"));
        users.add(new User("Jayson", "Zee", false, 345, "Jay_Z", "beyonce123"));
        return users;
    }

    public void checkDetails() {
        System.out.println("Please enter your Username");
        String username = new Scanner(System.in).nextLine();
        System.out.println("Please enter your password");
        String password = new Scanner(System.in).nextLine();
        for (User u : user) {
            if (username.equals(u.username)) {
                if (password.equals(u.password)) {
                    Menu m = new Menu();
                    m.getData();
                    m.printMenu();
                    break;
                }
            }
            System.out.println("Incorrect username/password, please try again.");
        }
    }

}