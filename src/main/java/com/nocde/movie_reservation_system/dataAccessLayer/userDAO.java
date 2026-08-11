package com.nocde.movie_reservation_system.dataAccessLayer;

import java.util.List;
import com.nocde.movie_reservation_system.model.User;

public interface userDAO{
    void addUser(User user);
    User getUserId(int id);
    List<User> getAllUser();
    void updateUser(User user);
    void deleteUser(int id);
}