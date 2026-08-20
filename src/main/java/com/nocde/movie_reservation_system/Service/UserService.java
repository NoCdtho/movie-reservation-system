package com.nocde.movie_reservation_system.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nocde.movie_reservation_system.model.User;
import com.nocde.movie_reservation_system.repository.user_repository_interface.user_DAO;

@Service
public class UserService {

    private final user_DAO user_dao;

    public UserService(user_DAO user_dao) {
        this.user_dao = user_dao;
    }

    public void addUser(User user) {
        user_dao.addUser(user);
    }

    public User getUserById(int id) {
        return user_dao.getUserById(id);
    }

    public List<User> getAllUsers() {
        return user_dao.getAllUser();
    }

    public void updateUser(User user) {
        user_dao.updateUser(user);
    }

    public void deleteUser(int id) {
        user_dao.deleteUser(id);
    }
}