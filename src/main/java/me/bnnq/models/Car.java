package me.bnnq.models;

public class Car
{
    private String model;
    private String color;
    private double engineVolume;
    private double price;
    private int year;


    public Car(String model, String color, double engineVolume, double price, int year)
    {
        this.model = model;
        this.color = color;
        this.engineVolume = engineVolume;
        this.price = price;
        this.year = year;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getEngineVolume()
    {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume)
    {
        this.engineVolume = engineVolume;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "{Model: " + model + ", color: " + color + ", engine volume: " + engineVolume + ", price: " + price + ", year: " + year + "}";
    }
}
