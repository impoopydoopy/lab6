package carshop.cars;

public class Truck extends Car{
    private int weight;

    public Truck(int speed, boolean isSellOut, double regularPrice, String color, int weight){
        super(speed, isSellOut, regularPrice, color);
        if (weight > 0)
            this.weight = weight;
        else this.weight = 1000;
    }

    public void setWeight(int weight) {
        if (weight > 0)
             this.weight = weight;
        else this.weight = 1000;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public double getSalePrice() {
        if(weight > 2000) return (super.getRegularPrice() - super.getRegularPrice()*(0.1));
        else {
            return super.getRegularPrice();
        }
    }
}
