package com.senla.flowershop;

public class Flower implements ICalcPrice{
    private String nameFlower;
    private int priceFlower;
    private int numberOfFlowers;

    public Flower(String nameFlower, int priceFlower, int numberOfFlowers) {
        this.nameFlower = nameFlower;
        this.priceFlower = priceFlower;
        this.numberOfFlowers = numberOfFlowers;
    }

    public int getPriceFlower() {
        return priceFlower;
    }

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    @Override
    public String toString() {
        return "Цветы в букете: " +
                "Название - " + nameFlower +
                ", цена - " + priceFlower +
                ", количество - " + numberOfFlowers +
                '.';
    }
    @Override
    public double getPriceBouquet() {
        double res = (double) (getPriceFlower()*getNumberOfFlowers())/100;
        System.out.println(this.toString() + " Стоимость - " + res);
        return res;
    }
}
