package com.senla.elhoteladmin.dao;

import com.senla.elhoteladmin.entity.Guest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GuestDaoImpl implements IGuestRepo {
    private final List<Guest> guests = new ArrayList<>();

    public GuestDaoImpl() {
        super();
    }

    @Override
    public Optional<Guest> get(Integer guestID) {
        return Optional.ofNullable(guests.get(guestID));
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
