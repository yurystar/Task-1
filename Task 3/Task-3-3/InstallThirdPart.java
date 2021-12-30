package com.senla.produce_auto;

public class InstallThirdPart implements IProduct{
    @Override
    public void installPart(String a) {
        System.out.println("Третья деталь - " + a + " установлена");
    }
}
