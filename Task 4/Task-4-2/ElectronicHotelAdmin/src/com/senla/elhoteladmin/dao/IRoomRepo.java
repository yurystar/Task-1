package com.senla.elhoteladmin.dao;

import com.senla.elhoteladmin.entity.Room;

import java.util.List;

public interface IRoomRepo extends DAO<Room> {
    List<Room> getHotelRoomsSortedByRoomPlaces();

    List<Room> getHotelRoomsSortedByRoomPrice();

    List<Room> getHotelRoomsSortedByRoomType();

    List<Room> getEmptyHotelRoomsSortedByRoomPlaces();

    List<Room> getEmptyHotelRoomsSortedByRoomPrice();

    List<Room> getEmptyHotelRoomsSortedByRoomType();

    long getNumberEmptyHotelRooms();

    void setNewPriceRoom(Integer roomNumber, Integer priceRoom);

    Room showRoomDetails(Integer roomNumber);
}
