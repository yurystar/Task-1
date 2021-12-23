package com.senla.elhoteladmin;

import java.util.*;

public class HotelGuest implements Check_in<HotelGuest> {
    private String name;
    private String surname;
    private int passportNum;

    public HotelGuest(String name, String surname, int passportNum) {
        this.name = name;
        this.surname = surname;
        this.passportNum = passportNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(int passportNum) {
        this.passportNum = passportNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelGuest)) return false;
        HotelGuest that = (HotelGuest) o;
        return getPassportNum() == that.getPassportNum() && getName().equals(that.getName()) && getSurname().equals(that.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getPassportNum());
    }

    @Override
    public String toString() {
        return "HotelGuest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportNum=" + passportNum +
                '}';
    }

    @Override
    public int chek_inHotel(HotelGuest hotelGuest) {
        System.out.println("Гость " + hotelGuest.getName() + " " + hotelGuest.getSurname() + ".");
        return hotelGuest.getPassportNum();
    }
}
