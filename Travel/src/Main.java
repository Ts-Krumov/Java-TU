public class Main {
    public static void main(String[] args) {
                Holiday holiday = new Holiday("Sofia", 2, 200, "Hotel");
                holiday.fixPrice();
                System.out.println(holiday.getPrice());

                Trip excursion = new Trip("Vratsa", 5, 500, 3);
                System.out.println(excursion.ensureNights());

    }
}