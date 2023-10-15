package me.bnnq.models;

public class Device
{
    private String name;
    private String color;
    private int year;
    private int price;
    private String type;

    public Device(String name, String color, int year, int price, String type)
    {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public int getYear()
    {
        return year;
    }

    public int getPrice()
    {
        return price;
    }

    public String getType()
    {
        return type;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return String.format("{Name='%s', color='%s', year=%d, price=%d}", name, color, year, price);
    }

}
