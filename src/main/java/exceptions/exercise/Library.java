package exceptions.exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private String address;
    private List<User> userList = new ArrayList<>();

    public Library(String address) {
        this.address = address;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {

    }

    public List<User> retrieveCreatedUsersBefore(LocalDateTime date) {
        return null;
    }

}
