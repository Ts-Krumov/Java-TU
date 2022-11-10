public class Main {
    public static void main(String[] args) {

        SickPatient patient = new SickPatient("Person", "Sofia ", "0012122121");
        patient.cure("Analgin", 3);
        System.out.println(patient.getEpicrisis());

    }
}