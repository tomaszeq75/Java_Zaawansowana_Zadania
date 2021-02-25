package rozgrzewka0220;

public class Product {

    //odwolywanie sie do zmiennych statycznych przez egzemplarz klasy

    private static int price = 10;
    int tax = 10;

    public static void main(String[] args) {
        Product product = new Product();

        int price = 1, tax = 2;
        System.out.println(price + " price " + product.tax +" product.tax " + product.price + " product.price");

        //zmienne lokalne nie moga miec modyfikatorow dostepu
//        private int secondPrice = 11;
    }


}
