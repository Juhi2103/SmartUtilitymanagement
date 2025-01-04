package backend.src.services;

import backend.src.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
    }

    public void registerUser(String name, String email) {
        User newUser = new User(name, email);
        users.add(newUser);
        System.out.println("User registered successfully!");
    }

    public void displayAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
        } else {
            System.out.println("Registered Users:");
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}
