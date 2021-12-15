package stock_system2;
public class User {

         String forename;
         String surname;
         boolean admin;
         int ID;
         String username;
         String password;

        public User(String forename, String surname, boolean admin, int ID, String username, String password) {
            this.forename = forename;
            this.surname = surname;
            this.admin = admin;
            this.ID = ID;
            this.username = username;
            this.password = password;
        }

    }

