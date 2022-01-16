package com.senla.elhoteladmin.dao;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import com.senla.elhoteladmin.entity.Guest;
import com.senla.elhoteladmin.entity.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GuestDaoImpl implements IGuestRepo {
    private static GuestDaoImpl instance;

    public static synchronized GuestDaoImpl getInstance() {
        if (instance == null) {
            instance = new GuestDaoImpl();
        }
        return instance;
    }

    private final List<Guest> guests = new ArrayList<>();

    @Override
    public Guest get(Integer guestID) throws ArrayIndexOutOfBoundsException{
        Guest guest = null;
        if (guestID > 0 && guestID < guests.size()) {
            guest = guests.get(guestID);
        }
        return guest;
    }

    @Override
    public List<Guest> getAll() {
        return guests;
    }

    @Override
    public void save(Guest guest) {
        guests.add(guest);
    }

    @Override
    public void update(Guest guest) {
        if (!guests.contains(guest)) {
            guests.add(guest);
        } else {
            System.out.println("Such an object already exists!");
        }
    }

    @Override
    public void delete(Guest guest) {
        guests.remove(guest);
    }

    @Override
    public Integer getNumberOfGuests() {
        return guests.size();
    }
}
