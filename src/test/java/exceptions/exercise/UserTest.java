package exceptions.exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {

    @Test
    void shouldCreateUser() {
        //given & when
        User result = User.create("testLogin", "testPass", "testFirstName", "test@mail.com");

        //then
        assertThat(result).isNotNull();
        assertThat(result.getLogin()).isEqualTo("testLogin");
        assertThat(result.getPassword()).isEqualTo("testPass");
        assertThat(result.getFirstName()).isEqualTo("testFirstName");
        assertThat(result.getEmail()).isEqualTo("test@mail.com");
        assertThat(result.getCreationDate()).isNotNull();
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        //given
        String testLogin = "short";

        //when & then
        assertThrows(IllegalArgumentException.class, () -> {
            User.create(testLogin, "testPass", "testFirstName", "test@mail.com");
        });
    }

    @Test
    void shouldThrowExceptionWhenArgumentIsNull() {
        //given
        String testFirstName = null;

        //when & then
        assertThrows(NullPointerException.class, () -> {
            User.create("testLogin", "testPass", testFirstName, "test@mail.com");
        });
    }

}
