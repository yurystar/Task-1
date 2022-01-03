package com.senla.elhoteladmin.dao;

import com.senla.elhoteladmin.entity.Room;
import com.senla.elhoteladmin.entity.RoomStatus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RoomDaoImpl implements IRoomRepo {
    private final List<Room> rooms = new ArrayList<>();

    @Override
    public Optional<Room> get(Integer roomID) {
        return Optional.ofNullable(rooms.get(roomID));
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }

    @Override
    public void save(Room room) {
        rooms.add(room);
    }

    @Override
    public void update(Room room) {
        if (!rooms.contains(room)) {
            rooms.add(room);
        } else {
            System.out.println("Such an object already exists!");
        }
    }

    @Override
    public void delete(Room room) {
        rooms.remove(room);
    }

    @Override
    public List<Room> getHotelRoomsSortedByRoomPlaces() {
        return rooms.stream()
                .sorted(Comparator.comparingInt(Room::getRoomPlaces))
                .collect(Collectors.toList());
    }

    @Override
    public List<Room> getHotelRoomsSortedByRoomPrice() {
        return rooms.stream()
                .sorted(Comparator.comparingInt(Room::getRoomPrice))
                .collect(Collectors.toList());
    }

    @Override
    public List<Room> getHotelRoomsSortedByRoomType() {
        return rooms.stream()
                .sorted(Comparator.comparing(Room::getRoomType))
                .collect(Collectors.toList());
    }

    @Override
    public List<Room> getEmptyHotelRoomsSortedByRoomPlaces() {
        return rooms.stream()
                .filter(room -> room.getRoomStatus().equals(RoomStatus.EMPTY))
                .sorted(Comparator.comparingInt(Room::getRoomPlaces))
                .collect(Collectors.toList());
    }

    @Override
    public List<Room> getEmptyHotelRoomsSortedByRoomPrice() {
        return rooms.stream()
                .filter(room -> room.getRoomStatus().equals(RoomStatus.EMPTY))
                .sorted(Comparator.comparingInt(Room::getRoomPrice))
                .collect(Collectors.toList());
    }

    @Override
    public List<Room> getEmptyHotelRoomsSortedByRoomType() {
        return rooms.stream()
                .filter(room -> room.getRoomStatus().equals(RoomStatus.EMPTY))
                .sorted(Comparator.comparing(Room::getRoomType))
                .collect(Collectors.toList());
    }

    @Override
    public long getNumberEmptyHotelRooms() {
        return rooms.stream()
                .filter(room -> room.getRoomStatus().equals(RoomStatus.EMPTY))
                .count();
    }

    @Override
    public void setNewPriceRoom(Integer roomNumber, Integer priceRoom) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                room.setRoomPrice(priceRoom);
            }
        }
    }

    @Override
    public Room showRoomDetails(Integer roomNumber) {
        return rooms.stream()
                .filter(room -> room.getRoomNumber().equals(roomNumber))
                .findFirst()
                .orElse(null);
    }
}
