// /*
// This class uses userDAO interface to create a user in the user table
// */


// package com.nocde.movie_reservation_system.controller;
// import com.nocde.movie_reservation_system.data_access_layer.user_repository_interface.user_DAO;
// import com.nocde.movie_reservation_system.data_access_layer.user_repository_interface.user_DAO_implementation;
// import com.nocde.movie_reservation_system.model.User;
// public class userController {
//     public static void main(String args[]){
//         user_DAO userdao = new user_DAO_implementation();

//         // creating a new user passing to the DAL
//         User user = new User("Rohit", "rohit@gmail.com");
//         userdao.addUser(user);

//         // retriving the new user via DAL
//         User fetchUser = userdao.getUserId(1);
//         System.out.println("Name of the user: " + fetchUser.getUserName());
//     }
// }
