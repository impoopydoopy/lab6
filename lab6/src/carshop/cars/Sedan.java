package carshop.cars;

public class Sedan extends Car{

    int length;

    public Sedan(int speed, boolean isSellOut, double regularPrice, String color, int length){
        super(speed, isSellOut, regularPrice, color);

        if(length > 0 && length <1000) this.length = length;
        else length = 15;
    }

    public void setLength(int length) {
        if(length > 0 && length <1000) this.length = length;
        else length = 15;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getSalePrice() {
        if(length > 20) return super.getRegularPrice()*0.95;
        else return super.getRegularPrice();
    }
}
