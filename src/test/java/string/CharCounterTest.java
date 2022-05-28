package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CharCounterTest {

    @Test
    void allLowercase() {
        //given
        String word = "xxoo";
        //when
        boolean result = CharCounter.checkXO(word);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void allUppercase() {
        //given
        String word = "OOXX";
        //when
        boolean result = CharCounter.checkXO(word);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void lowerCaseWithoutXandO() {
        //given
        String word = "abcdefgh";
        //when
        boolean result = CharCounter.checkXO(word);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void upperCaseWithoutXandO() {
        //given
        String word = "ABCDEFGH";
        //when
        boolean result = CharCounter.checkXO(word);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void allLowercaseNotMatch() {
        //given
        String word = "xxxoo";
        //when
        boolean result = CharCounter.checkXO(word);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void allUppercaseNotMatch() {
        //given
        String word = "OOOXX";
        //when
        boolean result = CharCounter.checkXO(word);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void onlySpace() {
        //given
        String word = " ";
        //when
        boolean result = CharCounter.checkXO(word);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void emptyString() {
        //given
        String word = "";
        //when
        boolean result = CharCounter.checkXO(word);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void differentCases() {
        //given
        String word = "abcdXXxooOdedede";
        //when
        boolean result = CharCounter.checkXO(word);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void twoWords() {
        //given
        String word = "testXx wordO";
        //when
        boolean result = CharCounter.checkXO(word);
        //then
        assertThat(result).isTrue();
    }

}
