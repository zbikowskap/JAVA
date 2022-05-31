package exceptions.exercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private String address;
    private List<User> userList = new ArrayList<>();

    public Library(String address) {
        this.address = address;
    }

    public void addUser(User user) {

    }

    public List<User> retrieveCreatedUsersBefore(LocalDate date) {
        return null;
    }

}
