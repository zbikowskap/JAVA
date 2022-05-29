package exceptions.exercise;

import java.time.LocalDateTime;

public class User {

    private String login;
    private String password;
    private String firstName;
    private String email;
    private LocalDateTime creationDate;

    private User(String login, String password, String firstName, String email, LocalDateTime creationDate) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.email = email;
        this.creationDate = creationDate;
    }

    public static User create(String login, String password, String firstName, String email) {
        return null;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
