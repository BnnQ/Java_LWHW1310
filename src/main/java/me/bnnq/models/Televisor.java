package me.bnnq.models;

public class Televisor
{
    private String model;
    private double diagonal;
    private String manufacturer;
    private int year;
    private double price;

    public Televisor(String model, double diagonal, String manufacturer, int year, double price)
    {
        this.model = model;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public double getDiagonal()
    {
        return diagonal;
    }

    public void setDiagonal(double diagonal)
    {
        this.diagonal = diagonal;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return String.format("{Model: '%s', diagonal: %.1f, manufacturer: '%s', year: %d, price: %.1f}", model, diagonal, manufacturer, year, price);
    }
}
