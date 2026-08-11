package com.nocde.movie_reservation_system.data_access_layer.user_repository_interface;

import java.util.List;
import com.nocde.movie_reservation_system.model.User;

public interface user_DAO{
    void addUser(User user);
    User getUserId(int id);
    List<User> getAllUser();
    void updateUser(User user);
    void deleteUser(int id);
}