package dao;

import entities.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);

    void deleteUser(int id);

    List<User> findAllUsers();
}
