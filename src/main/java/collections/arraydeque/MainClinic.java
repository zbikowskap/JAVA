package collections.arraydeque;

public class MainClinic {

    public static void main(String[] args) {
        Clinic clinic = new Clinic();

        clinic.registerPatient("Michal");
        clinic.registerPatient("Romek");
        clinic.registerPatient("Basia");

        String handledPatient = clinic.handlePatient();
        System.out.println(handledPatient); //Michal, bo najdluzej stal w kolejce
    }

}
