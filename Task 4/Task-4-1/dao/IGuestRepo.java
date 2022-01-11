package com.senla.elhoteladmin.dao;

import com.senla.elhoteladmin.entity.Guest;

public interface IGuestRepo extends DAO<Guest> {
    Integer getNumberOfGuests();
}
