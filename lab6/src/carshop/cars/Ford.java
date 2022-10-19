package carshop.cars;

public class Ford extends Car{
    int year;
    int manufacturerDiscount;

    public Ford(int speed, boolean isSellOut, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, isSellOut, regularPrice, color);

        if(year > 1883 && year <= 2022)
             this.year = year;
        else this.year = 2020;

        if(manufacturerDiscount >=0 && manufacturerDiscount <=100)
             this.manufacturerDiscount = manufacturerDiscount;
        else this.manufacturerDiscount = 0;
    }

    public void setYear(int year) {
        if(year > 1883 && year <= 2022)
             this.year = year;
        else this.year = 2020;
    }

    public int getYear() {
        return year;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        if(manufacturerDiscount >=0 && manufacturerDiscount <=100)
             this.manufacturerDiscount = manufacturerDiscount;
        else this.manufacturerDiscount = 0;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return (super.getRegularPrice()*(1-(manufacturerDiscount/100)));
    }
}
