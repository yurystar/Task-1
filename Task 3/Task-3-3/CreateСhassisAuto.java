package com.senla.produce_auto;

public class CreateСhassisAuto implements ILineStep {
    @Override
    public String buildProductPart() {
        final String chassis = "Шасси авто";
        System.out.println("Шасси авто создано.");
        return chassis;
    }
}
