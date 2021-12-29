package com.senla.elhoteladmin;

import java.util.Objects;

public class AdditionalService implements Check_in<AdditionalService> {
    private String serviceName;
    private int servicePrice;

    public AdditionalService(String serviceName, int servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(int servicePrice) {
        this.servicePrice = servicePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdditionalService)) return false;
        AdditionalService that = (AdditionalService) o;
        return getServicePrice() == that.getServicePrice() && getServiceName().equals(that.getServiceName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServiceName(), getServicePrice());
    }

    @Override
    public String toString() {
        return "AdditionalServices{" +
                "serviceName='" + serviceName + '\'' +
                ", servicePrice=" + servicePrice +
                '}';
    }

    @Override
    public int chek_inHotel(AdditionalService additionalService) {
        System.out.println("Дополнительный сервис " + additionalService.getServiceName() +
                " добавлен. Стоимость услуги - " + additionalService.getServicePrice() + ".");
        return additionalService.getServicePrice();
    }
}
