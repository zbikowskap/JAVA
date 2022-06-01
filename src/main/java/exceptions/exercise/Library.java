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

    /*public void addUser(User user) throws UserAlreadyExistException {
        for (User existUser : userList) {
            if (existUser.getLogin().equals(user.getLogin())) {
                throw new UserAlreadyExistException("");
            }
        }

        this.userList.add(user);
    }*/

    public void addUser(User user) throws UserAlreadyExistException {
        if (userList.contains(user)) {
            throw new UserAlreadyExistException("");
        }

        this.userList.add(user);
    }

    public List<User> retrieveCreatedUsersBefore(LocalDateTime date) {
        List<User> resultList = new ArrayList<>();

        for (User user : userList) {
            if (user.getCreationDate().isBefore(date)) {
                resultList.add(user);
            }
        }

        return resultList;
    }

}
