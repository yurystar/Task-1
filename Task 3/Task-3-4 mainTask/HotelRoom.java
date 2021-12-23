package com.senla.elhoteladmin;

import java.util.Objects;

public class HotelRoom implements Check_in <HotelRoom>, Check_out <HotelRoom>, Room_On_repair <HotelRoom>{
    private int roomNumber;
    private int roomType;
    private int roomPrice;
    private int roomPlaces;
    private String roomStatus;

    public HotelRoom(int roomNumber, int roomType, int roomPrice, int roomPlaces, String roomStatus) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomPlaces = roomPlaces;
        this.roomStatus = roomStatus;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getRoomPlaces() {
        return roomPlaces;
    }

    public void setRoomPlaces(int roomPlaces) {
        this.roomPlaces = roomPlaces;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelRoom)) return false;
        HotelRoom room = (HotelRoom) o;
        return getRoomNumber() == room.getRoomNumber() && getRoomType() == room.getRoomType() &&
                getRoomPrice() == room.getRoomPrice() && getRoomPlaces() == room.getRoomPlaces()
                && getRoomStatus().equals(room.getRoomStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoomNumber(), getRoomType(), getRoomPrice(), getRoomPlaces(), getRoomStatus());
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "roomNumber=" + roomNumber +
                ", roomType=" + roomType +
                ", roomPrice=" + roomPrice +
                ", roomPlaces=" + roomPlaces +
                ", roomStatus='" + roomStatus + '\'' +
                '}';
    }

    @Override
    public int chek_inHotel(HotelRoom hotelRoom) {
        hotelRoom.setRoomStatus("Busy");
        System.out.println("Комната " + hotelRoom + " заселена");
        return hotelRoom.getRoomPrice();
    }

    @Override
    public void check_outHotel(HotelRoom hotelRoom) {
        String s = hotelRoom.getRoomStatus();
        if (!s.equals("Free")) hotelRoom.setRoomStatus("Free");
    }

    @Override
    public void HotelRoom_On_repair(HotelRoom hotelRoom) {
        hotelRoom.setRoomStatus("Room on repair");
    }

    @Override
    public void HotelRoom_Out_repair(HotelRoom hotelRoom) {
        String s = hotelRoom.getRoomStatus();
        if (s.equals("Room on repair")) hotelRoom.setRoomStatus("Free");
    }
}
