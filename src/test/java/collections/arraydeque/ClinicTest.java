package collections.arraydeque;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClinicTest {

    @Test
    void shouldHandlePatient() {
        //given
        Clinic clinic = new Clinic();
        clinic.registerPatient("Maciej");
        clinic.registerPatient("Maciek");
        //when
        String result = clinic.handlePatient();
        //then
        assertThat(result).isEqualTo("Maciej");
    }

}
