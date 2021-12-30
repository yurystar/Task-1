package com.senla.produce_auto;

public class CreateEngineAuto implements ILineStep {
    @Override
    public String buildProductPart() {
        final String engine = "Двигатель авто";
        System.out.println("Двигатель авто создан.");
        return engine;
    }
}
