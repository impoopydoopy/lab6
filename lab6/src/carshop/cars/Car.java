package carshop.cars;

public abstract class Car {
    private int speed;
    private boolean isSellOut;
    private double regularPrice;
    private String color;

    Car(int speed, boolean isSellOut, double regularPrice, String color)
    {
        if(speed > 0 && speed < 400)
            this.speed = speed;
        else this.speed = 100;

        isSellOut = isSellOut;

        if (regularPrice >= 0)
            this.regularPrice = regularPrice;
        else this.regularPrice = 10000;

        this.color = color;
    }

    //region Get-Set
    public void setSpeed(int speed) {
        if(speed > 0 && speed < 400)
             this.speed = speed;
        else this.speed = 100;
    }

    public int getSpeed() {
        return speed;
    }

    public void setIsSellOut(boolean isSellOut) {
        this.isSellOut = isSellOut;
    }

    public boolean getIsSellOut() {
        return isSellOut;
    }

    public void setRegularPrice(double regularPrice) {
        if (regularPrice >= 0)
             this.regularPrice = regularPrice;
        else this.regularPrice = 10000;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //endregion

    public abstract double getSalePrice();

}
