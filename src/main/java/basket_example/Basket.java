package basket_example;

public class Basket {

    private int numberOfItems;

    public void addToBasket() throws BasketFullCheckedException {
        if (numberOfItems == 10) {
            throw new BasketFullCheckedException();
//            throw new BasketFullException("Unable to add more elements. Basket full", -1);
        }
        numberOfItems++;
    }

    public void removeFromBasket() throws BasketFullException {
        if (numberOfItems == 0) {
//            throw new BasketFullCheckedException();
            throw new BasketFullException("Unable to remove more elements. Basket empty", -11);
        }
        numberOfItems--;
    }

    public static void main(String[] args) throws BasketFullCheckedException {
        Basket basket = new Basket();
        for (int i = 0; i < 1; i++) {
            basket.addToBasket();
        }

        for (int i = -1; i < 11; i++) {
            basket.removeFromBasket();
        }

    }

}