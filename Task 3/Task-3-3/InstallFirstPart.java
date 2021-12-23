package com.senla.produce_auto;

public class InstallFirstPart implements IProduct {
    @Override
    public void installPart(String a) {
        System.out.println("Первая деталь - " + a + " установлена");
    }
}
