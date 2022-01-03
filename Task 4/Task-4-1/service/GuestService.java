package com.senla.elhoteladmin.service;

import com.senla.elhoteladmin.dao.IGuestRepo;
import com.senla.elhoteladmin.entity.Guest;

import java.util.List;

public class GuestService implements IGuestService {
    private IGuestRepo guestRepo;

    public GuestService(IGuestRepo guestRepo) {
        this.guestRepo = guestRepo;
    }

    @Override
    public void addGuestInStorage(Guest guest) {
        guestRepo.save(guest);
    }

    @Override
    public void removeGuestFromStorage(Guest guest) {
        guestRepo.delete(guest);
    }

    @Override
    public List<Guest> getGuestsHotel() {
        return guestRepo.getAll();
    }

    @Override
    public long getNumberGuestsHotel() {
        return guestRepo.getNumberOfGuests();
    }
}
