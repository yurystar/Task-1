package com.senla.produce_auto;

public class InstallSecondPart implements IProduct{
    @Override
    public void installPart(String a) {
        System.out.println("Вторая деталь - " + a + " установлена");
    }
}
