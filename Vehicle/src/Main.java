public class Main {
    public static void main(String[] args) {
        Car car = new Car(260, "A4", 10000, 180);
        Ship ship = new Ship(180, "Titanic", 22000, 5300);
        Hovercraft hovercraft = new Hovercraft(120, "hover5", 16000, 12);

        car.enterLand();
        System.out.println("Ship promo: " + ship.checkPromo());
    }
}