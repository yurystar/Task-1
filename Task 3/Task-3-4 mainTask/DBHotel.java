package com.senla.elhoteladmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBHotel {
    static List<HotelRoom> hotelRoomList = new ArrayList<>();
    static List<AdditionalService> additionalServicesList = new ArrayList<>();
    static Map<Integer, HotelGuest> hotelGuestMap = new HashMap();

    /* ------------------------------------ Rooms operation ---------------------------*/

    static void addHotelRoom (HotelRoom hotelRoom) {
        hotelRoomList.add(hotelRoom);
    }
    static void deleteHotelRoom (int i) {
        hotelRoomList.remove(i);
    }
    static {
        HotelRoom room1 = new HotelRoom(1, 1, 1000, 2, "Free");
        HotelRoom room2 = new HotelRoom(2, 1, 1000, 2, "Free");
        HotelRoom room3 = new HotelRoom(3, 2, 2000, 2, "Free");
        HotelRoom room4 = new HotelRoom(4, 3, 3500, 3, "Free");
        HotelRoom room5 = new HotelRoom(5, 4, 5600, 3, "Free");

        DBHotel.addHotelRoom(room1);
        DBHotel.addHotelRoom(room2);
        DBHotel.addHotelRoom(room3);
        DBHotel.addHotelRoom(room4);
        DBHotel.addHotelRoom(room5);

    }
    static void sortHotelRooms () {hotelRoomList.sort((o1, o2) -> o1.getRoomNumber()-o2.getRoomNumber());}
    static void printHotelRooms () {
        hotelRoomList.stream().forEach(System.out::println);
    }
    static void changePriceRoom(int room, int price) {
        HotelRoom hotelRoom = hotelRoomList.get(room);
        hotelRoom.setRoomPrice(price);
    }

    /* -------------------------- AdditionalService operation ----------------------------*/

    static void addAdditionalService(AdditionalService a) {
        additionalServicesList.add(a);
    }
    static void deleteAdditionalService(AdditionalService a) {
        additionalServicesList.remove(a);
    }

    /* Учет предполагает наличие пронумерованного списка услуг у администратора*/
    /* Либо надо переделать на Map*/

    static {
        AdditionalService cleaning = new AdditionalService("Cleaning",600);
        AdditionalService foodDelivery = new AdditionalService("Food delivery",400);
        AdditionalService washingClothes = new AdditionalService("Washing clothes",100);
        AdditionalService cableTV = new AdditionalService("Cable TV",100);
        AdditionalService safe = new AdditionalService("Safe",100);

        DBHotel.addAdditionalService(cleaning);
        DBHotel.addAdditionalService(foodDelivery);
        DBHotel.addAdditionalService(washingClothes);
        DBHotel.addAdditionalService(cableTV);
        DBHotel.addAdditionalService(safe);
    }
    static void printAdditionalServices() {
        additionalServicesList.stream().forEach(System.out::println);
    }
    static void changePriceAdditionalServices(int numServ, int price) {
        HotelRoom hotelRoom = hotelRoomList.get(numServ);
        hotelRoom.setRoomPrice(price);
    }

    /* ------------------------------ Guests operation -------------------------*/

    static void addHotelGuest(Integer passport, HotelGuest hotelGuest) {
        hotelGuestMap.put(passport, hotelGuest);
    }
    static void deleteHotelGuest(Integer passport) {
        hotelGuestMap.remove(passport);
    }
    static void printHotelGuests() {
        for (Map.Entry<Integer, HotelGuest> entry : hotelGuestMap.entrySet())
        {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }

}
