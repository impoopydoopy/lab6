package carshop.impl;

import carshop.cars.Car;
import carshop.cars.Ford;
import carshop.cars.Sedan;
import carshop.cars.Truck;
import carshop.interfase.Admin;
import carshop.interfase.Customer;

public class MyOwnAutoshop implements Admin, Customer {
    Car shopArray[] = new Car[5];

    public MyOwnAutoshop(){
        shopArray[0] = new Sedan(100, false, 50000, "red", 20);
        shopArray[1] = new Ford(123, false, 75000, "purple", 1987, 20);
        shopArray[2] = new Ford(300, false, 80000, "black", 2004, 10);
        shopArray[3] = new Truck(150, false, 45000, "yellow", 1500);
        shopArray[4] = new Truck(200, false, 48000, "brown", 600);
    }

    @Override
    public void getIncome() {
        int sum = 0;
        for (Car car: shopArray) {
            if(car.getIsSellOut()) sum += car.getSalePrice();
        }
        System.out.println("доход: " + sum);
    }

    @Override
    public void getCarsPrice() {
        for (Car car: shopArray){
            System.out.println(car.getClass().getSimpleName() + " цена: " + car.getSalePrice());
        }
    }

    @Override
    public void getCarsColors() {
        for (Car car: shopArray){
            System.out.println(car.getClass().getSimpleName() + " цвет: " + car.getColor());
        }
    }

    @Override
    public void getCarPrice(int id) {
        try{
            System.out.println("цена: " + shopArray[id].getSalePrice());
        }
        catch (Exception exception)
        {
            System.out.println("The index you have entered is invalid");
        }
    }

    @Override
    public void getCarColor(int id) {
        try{
            System.out.println("цвет: " + shopArray[id].getColor());
        }
        catch (Exception exception)
        {
            System.out.println("The index you have entered is invalid");
        }
    }

    @Override
    public void purchaseCar(int id) {

        try{
            shopArray[id].setIsSellOut(true);
            System.out.println("Вы приобрели машину: " + shopArray[id].getClass().getSimpleName());
        }
        catch (Exception exception)
        {
            System.out.println("The index you have entered is invalid");
        }
    }
}
