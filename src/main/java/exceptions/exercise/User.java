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
        validateNull(login, "Login");
        validateNull(password, "Password");
        validateNull(firstName, "FirstName");
        validateNull(email, "Email");

        if (login.length() < 6) {
            throw new IllegalArgumentException("Login is too short.");
        }

        return new User(login, password, firstName, email, LocalDateTime.now());
    }

    /**
     * Klasa Object jest rodzicem wszystkim klas w Javie. Co sprawia, że możemy tam przekazać String, Integer lub np. Car.
     */
    private static void validateNull(Object value, String field) {
        if (value == null) {
            throw new NullPointerException(field + " can not be null");
        }
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
