/*
This files is used to create the users data access layer function to 
interact with the database with the user object that are being created.
*/

package com.nocde.movie_reservation_system.repository.user_repository_interface;

import java.util.List;
import com.nocde.movie_reservation_system.model.User;

public interface user_DAO{
    void addUser(User user);
    User getUserById(int id);
    List<User> getAllUser();
    void updateUser(User user);
    void deleteUser(int id);
}