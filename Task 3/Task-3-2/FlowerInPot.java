package com.senla.flowershop;

public class FlowerInPot extends Flower{
    private int priceOfPot;

    public FlowerInPot(String nameFlower, int priceFlower, int numberOfFlowers, int priceOfPot) {
        super(nameFlower, priceFlower, numberOfFlowers);
        this.priceOfPot = priceOfPot;
    }

    public int getPriceOfPot() {
        return priceOfPot;
    }

    @Override
    public String toString() {
        return super.toString() + " Цветочный горшок." +
                " Цена горшка - " + priceOfPot +
                '.';
    }

    @Override
    public double getPriceBouquet() {
        double res = (double) ((getPriceOfPot() + getPriceFlower()) * getNumberOfFlowers())/100;
        System.out.println(this.toString() + " Стоимость - " + res);
        return res;
    }
}
