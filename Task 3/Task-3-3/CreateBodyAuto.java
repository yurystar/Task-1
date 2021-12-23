package com.senla.produce_auto;

public class CreateBodyAuto implements ILineStep {
    @Override
    public String buildProductPart() {
        final String body = "Кузов авто";
        System.out.println("Кузов авто создан.");
        return body;
    }
}
