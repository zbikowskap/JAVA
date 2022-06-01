package exceptions.exercise;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void addUser() throws UserAlreadyExistException {
        //given
        Library library = new Library("Romantyczna 5");
        User user = User.create("Czytelnik1234", "czytelnik1234", "Krzysztof", "kczytelnik@wp.pl");

        //when
        library.addUser(user);

        //then
        assertThat(library.getUserList()).hasSize(1);
    }

    @Test
    void shouldThrowUserAlreadyExistException() throws UserAlreadyExistException {
        //given
        Library library = new Library("Romantyczna 5");
        User user = User.create("Czytelnik1234", "czytelnik1234", "Krzysztof", "kczytelnik@wp.pl");
        library.addUser(user);

        //when & then
        assertThrows(UserAlreadyExistException.class, () -> {
            User userAndrej = User.create("Czytelnik1234", "czytelnik12345", "Andrzej", "andrej@wp.pl");
            library.addUser(userAndrej);
        });
    }

    @Test
    void retrieveCreatedUsersBefore() throws UserAlreadyExistException {
        //given
        Library library = new Library("Romantyczna 5");
        User user = User.create("Czytelnik1234", "czytelnik1234", "Krzysztof", "kczytelnik@wp.pl");
        User user2 = User.create("Czytelnik12345", "czytelnik12345", "Filip", "filip@wp.pl");
        library.addUser(user);
        library.addUser(user2);

        //when
        List<User> result = library.retrieveCreatedUsersBefore(LocalDateTime.now().plusDays(1));

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void retrieveCreatedUsersBeforeEmptyResult() throws UserAlreadyExistException {
        //given
        Library library = new Library("Romantyczna 5");
        User user = User.create("Czytelnik1234", "czytelnik1234", "Krzysztof", "kczytelnik@wp.pl");
        User user2 = User.create("Czytelnik12345", "czytelnik12345", "Filip", "filip@wp.pl");
        library.addUser(user);
        library.addUser(user2);

        //when
        List<User> result = library.retrieveCreatedUsersBefore(LocalDateTime.of(2021, 1, 1, 12, 0, 0));

        //then
        assertThat(result).isEmpty();
    }
}
