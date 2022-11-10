public class Main {
    public static void main(String[] args) {
        TV tv = null;
        Book book = null;
        try {
            tv = new TV(4325, "LG", "L1", 220, 699.99);
        } catch (PriceException | PowerException e) {
            System.out.println(e.getMessage());
        }
        try {
            book = new Book(64327, "Title", "Author", -19.99);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }
        if (tv != null){System.out.println("Promo tv: " + tv.checkPromo());}
        if (book != null){System.out.println("Promo book: " + book.checkPromo());}



    }
}