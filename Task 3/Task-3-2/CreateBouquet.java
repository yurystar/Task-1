package com.senla.flowershop;

import java.util.ArrayList;
import java.util.List;

public class CreateBouquet {

    public static void main(String[] args) {
        double resultPrice = 0;
        List <ICalcPrice> bouquetOfFlowers = new ArrayList<>();
        ICalcPrice flower1 = new Flower("Тюльпан",527, 4);
        ICalcPrice flower2 = new Flower("Роза",631, 8);
        ICalcPrice flower3 = new Flower("Гладиолус",787,6);
        ICalcPrice flower4 = new Flower("Гвоздика",453,9);
        ICalcPrice flowerInPot1 =
                new FlowerInPot("Орхидея", 1025, 2, 500);
        bouquetOfFlowers.add(flower1);
        bouquetOfFlowers.add(flower2);
        bouquetOfFlowers.add(flower3);
        bouquetOfFlowers.add(flower4);
        bouquetOfFlowers.add(flowerInPot1);

        for (ICalcPrice b : bouquetOfFlowers) {
            resultPrice += b.getPriceBouquet();
        }
        System.out.println("Цена букета - " + resultPrice);
    }
}
