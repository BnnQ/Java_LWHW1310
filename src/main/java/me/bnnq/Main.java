package me.bnnq;

import me.bnnq.models.Car;
import me.bnnq.models.City;
import me.bnnq.models.Device;
import me.bnnq.models.Televisor;
import me.bnnq.utils.ScannerUtilities;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args)
    {
        task5();
    }

    public static void task1()
    {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 21) - 10;

        int number = ScannerUtilities.scanInt("Enter a number to search for: ");
        System.out.printf("Array: %s\n", Arrays.toString(array));

        int evenNumbersCount = Arrays.stream(array).filter(x -> x % 2 == 0).toArray().length;
        System.out.printf("Even numbers count: %d\n", evenNumbersCount);

        int oddNumbersCount = Arrays.stream(array).filter(x -> x % 2 != 0).toArray().length;
        System.out.printf("Odd numbers count: %d\n", oddNumbersCount);

        int zeroNumbersCount = Arrays.stream(array).filter(x -> x == 0).toArray().length;
        System.out.printf("Zero numbers count: %d\n", zeroNumbersCount);

        int userNumberCount = Arrays.stream(array).filter(x -> x == number).toArray().length;
        System.out.printf("Number %d count: %d\n", number, userNumberCount);
    }

    public static void task2()
    {
        City[] cities = new City[] { new City("Kryvyi Rih"), new City("Kyiv"), new City("Kharkiv"), new City("Amsterdam"), new City("London") };
        System.out.printf("Cities: %s\n", Arrays.toString(cities));

        String cityName = ScannerUtilities.scanString("Enter a city name to search for: ");
        String firstLetterToFind = ScannerUtilities.scanString("Enter a first letter to search for cities with it: ");

        System.out.printf("Cities with name length more than 6: %s\n", Arrays.toString(Arrays.stream(cities).filter(x -> x.getName().length() > 6).toArray()));

        int numberOfSpecifiedCity = Arrays.stream(cities).filter(x -> x.getName().equals(cityName)).toArray().length;
        System.out.printf("Number of specified city '%s': %d\n", cityName, numberOfSpecifiedCity);

        int numberOfCitiesThatStartsWithSpecifiedLetter = Arrays.stream(cities).filter(x -> x.getName().startsWith(firstLetterToFind)).toArray().length;
        System.out.printf("Number of cities that starts with '%s': %d\n", firstLetterToFind, numberOfCitiesThatStartsWithSpecifiedLetter);
    }

    private static void task3()
    {
        Car[] cars = new Car[] { new Car("BMW", "Black", 2.0, 20000, 2005), new Car("Audi", "White", 2.5, 25000, 2007), new Car("Mercedes", "Red", 3.0, 30000, 2013) };
        System.out.printf("Cars: %s\n", Arrays.toString(cars));

        String color = ScannerUtilities.scanString("Enter a color to search for: ").toLowerCase();
        System.out.printf("Cars with specified color: %s\n", Arrays.toString(Arrays.stream(cars).filter(x -> x.getColor().toLowerCase().equals(color)).toArray()));

        double engineVolume = ScannerUtilities.scanDouble("Enter an engine volume to search for: ");
        System.out.printf("Cars with specified engine volume: %s\n", Arrays.toString(Arrays.stream(cars).filter(x -> x.getEngineVolume() == engineVolume).toArray()));

        double price = ScannerUtilities.scanDouble("Enter a price to search for: ");
        System.out.printf("Cars with price more than specified: %s\n", Arrays.toString(Arrays.stream(cars).filter(x -> x.getPrice() > price).toArray()));

        int yearLeftBound = ScannerUtilities.scanInt("Enter a left bound of year to search for: ");
        int yearRightBound = ScannerUtilities.scanInt("Enter a right bound of year to search for: ");
        System.out.printf("Cars with year between %d and %d: %s\n", yearLeftBound, yearRightBound, Arrays.toString(Arrays.stream(cars).filter(x -> x.getYear() >= yearLeftBound && x.getYear() <= yearRightBound).toArray()));
    }

    public static void task4()
    {
        Televisor[] televisors = new Televisor[] { new Televisor("Samsung", 32, "Samsung", 2015, 10000), new Televisor("LG", 40, "LG", 2017, 15000), new Televisor("Sony", 50, "Sony", 2023, 20000) };
        System.out.printf("Televisors: %s\n", Arrays.toString(televisors));

        double diagonal = ScannerUtilities.scanDouble("Enter a diagonal to search for: ");
        System.out.printf("Televisors with specified diagonal: %s\n", Arrays.toString(Arrays.stream(televisors).filter(x -> x.getDiagonal() == diagonal).toArray()));

        String manufacturer = ScannerUtilities.scanString("Enter a manufacturer to search for: ");
        System.out.printf("Televisors with specified manufacturer: %s\n", Arrays.toString(Arrays.stream(televisors).filter(x -> x.getManufacturer().equals(manufacturer)).toArray()));

        int currentYear = LocalDate.now().getYear();
        System.out.printf("Televisors released in current year: %s\n", Arrays.toString(Arrays.stream(televisors).filter(x -> x.getYear() == currentYear).toArray()));

        double price = ScannerUtilities.scanDouble("Enter a price to search for: ");
        System.out.printf("Televisors with price more than specified: %s\n", Arrays.toString(Arrays.stream(televisors).filter(x -> x.getPrice() > price).toArray()));

        System.out.printf("Televisors sorted by ascending price: %s\n", Arrays.toString(Arrays.stream(televisors).sorted(Comparator.comparingDouble(Televisor::getPrice)).toArray()));
        System.out.printf("Televisors sorted by descending price: %s\n", Arrays.toString(Arrays.stream(televisors).sorted(Comparator.comparingDouble(Televisor::getPrice).reversed()).toArray()));
        System.out.printf("Televisors sorted by ascending diagonal: %s\n", Arrays.toString(Arrays.stream(televisors).sorted(Comparator.comparingDouble(Televisor::getDiagonal)).toArray()));
        System.out.printf("Televisors sorted by descending diagonal: %s\n", Arrays.toString(Arrays.stream(televisors).sorted(Comparator.comparingDouble(Televisor::getDiagonal).reversed()).toArray()));
    }

    public static void task5()
    {
        int[] randomNumbers = new int[20];
        for (int i = 0; i < randomNumbers.length; i++)
            randomNumbers[i] = (int) (Math.random() * 5000) - 10;

        System.out.printf("Random numbers: %s\n", Arrays.toString(randomNumbers));

        int numberOfPositiveNumbers = Arrays.stream(randomNumbers).filter(x -> x > 0).toArray().length;
        System.out.printf("Number of positive numbers: %d\n", numberOfPositiveNumbers);

        int numberOfNegativeNumbers = Arrays.stream(randomNumbers).filter(x -> x < 0).toArray().length;
        System.out.printf("Number of negative numbers: %d\n", numberOfNegativeNumbers);

        int numberOfTwoDigitNumbers = Arrays.stream(randomNumbers).filter(x -> String.valueOf(x).length() == 2).toArray().length;
        System.out.printf("Number of two-digit numbers: %d\n", numberOfTwoDigitNumbers);

        int numberOfPalindromeNumbers = Arrays.stream(randomNumbers).filter(x -> String.valueOf(x).contentEquals(new StringBuilder(String.valueOf(x)).reverse())).toArray().length;
        System.out.printf("Number of palindrome numbers: %d\n", numberOfPalindromeNumbers);
    }

    public static void task6()
    {
        String[] productNames = new String[] { "Milk", "Bread", "Butter", "Cheese", "Sausage", "Eggs", "Cereals", "Juice", "Water", "Soda" };

        System.out.printf("Products: %s\n", Arrays.toString(productNames));
        System.out.printf("Products with name length less than 5: %s\n", Arrays.toString(Arrays.stream(productNames).filter(x -> x.length() < 5).toArray()));

        String product = ScannerUtilities.scanString("Enter a product to search for: ");
        System.out.printf("Number of specified product: %d\n", Arrays.stream(productNames).filter(x -> x.equals(product)).toArray().length);

        String firstLetter = ScannerUtilities.scanString("Enter a first letter to search for products with it: ");
        System.out.printf("Number of products that starts with specified letter: %d\n", Arrays.stream(productNames).filter(x -> x.startsWith(firstLetter)).toArray().length);

        System.out.printf("Products from milk category: %s\n", Arrays.toString(Arrays.stream(productNames).filter(x -> x.equals("Milk") || x.equals("Butter") || x.equals("Cheese")).toArray()));
    }

    public static void task7()
    {
        Device[] devices = new Device[] { new Device("iPhone", "Black", 2015, 20000, "Mobile phone"), new Device("Samsung", "White", 2017, 15000, "Mobile phone"), new Device("Xiaomi", "Red", 2023, 10000, "Mobile phone"), new Device("LG", "Black", 2021, 20000, "Televisor") };
        System.out.printf("Devices: %s\n", Arrays.toString(devices));

        String color = ScannerUtilities.scanString("Enter a color to search for: ");
        System.out.printf("Devices with specified color: %s\n", Arrays.toString(Arrays.stream(devices).filter(x -> x.getColor().equals(color)).toArray()));

        int year = ScannerUtilities.scanInt("Enter a year to search for: ");
        System.out.printf("Devices with specified year: %s\n", Arrays.toString(Arrays.stream(devices).filter(x -> x.getYear() == year).toArray()));

        double price = ScannerUtilities.scanDouble("Enter a price to search for: ");
        System.out.printf("Devices with price more than specified: %s\n", Arrays.toString(Arrays.stream(devices).filter(x -> x.getPrice() > price).toArray()));

        String type = ScannerUtilities.scanString("Enter a type to search for: ");
        System.out.printf("Devices with specified type: %s\n", Arrays.toString(Arrays.stream(devices).filter(x -> x.getType().equals(type)).toArray()));

        int yearLeftBound = ScannerUtilities.scanInt("Enter a left bound of year to search for: ");
        int yearRightBound = ScannerUtilities.scanInt("Enter a right bound of year to search for: ");

        System.out.printf("Devices with year between %d and %d: %s\n", yearLeftBound, yearRightBound, Arrays.toString(Arrays.stream(devices).filter(x -> x.getYear() >= yearLeftBound && x.getYear() <= yearRightBound).toArray()));
    }

    public static void task8()
    {
        //skip due to repetition of task
    }

}