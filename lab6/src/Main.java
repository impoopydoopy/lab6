import carshop.impl.MyOwnAutoshop;

public class Main {
    public static void main(String[] args) {
        MyOwnAutoshop shop = new MyOwnAutoshop();

        shop.getCarsPrice();
        shop.getCarsColors();
        shop.getIncome();

        shop.getCarPrice(2);
        shop.purchaseCar(2);

        shop.purchaseCar(25);

        shop.getCarColor(4);
        shop.purchaseCar(4);
        shop.getIncome();
    }
}