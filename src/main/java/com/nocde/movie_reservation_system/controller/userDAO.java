package com.nocde.movie_reservation_system.controller;

import java.util.List;
import com.nocde.movie_reservation_system.model.user;

public interface userDAO{
    void addUser(user user);
    user getUserId(int id);
    List<user> getAllUser();
    void updateUser(user user);
    void deleteClient(int id);
}