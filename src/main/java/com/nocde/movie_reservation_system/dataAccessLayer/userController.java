package com.nocde.movie_reservation_system.dataAccessLayer;
import com.nocde.movie_reservation_system.model.User;
public class userController {
    public static void main(String args[]){
        userDAO userdao = new userDAOImplementation();

        // creating a new user passing to the DAL
        User user = new User("Rohit", "rohit@gmail.com");
        userdao.addUser(user);

        // retriving the new user via DAL
        User fetchUser = userdao.getUserId(1);
        System.out.println("Name of the user: " + fetchUser.getUserName());
    }
}
