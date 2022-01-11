package com.senla.elhoteladmin.service;

import com.senla.elhoteladmin.dao.IBookingOrderRepo;
import com.senla.elhoteladmin.entity.AdditionalService;
import com.senla.elhoteladmin.entity.BookingOrder;

import java.util.List;

public class BookingOrderService implements IBookingOrderService {
    private IBookingOrderRepo bookingOrderRepo;

    public BookingOrderService(IBookingOrderRepo bookingOrderRepo) {
        this.bookingOrderRepo = bookingOrderRepo;
    }

    @Override
    public List<BookingOrder> getLastThreeGuestsRoom(Integer roomNumber) {
        return bookingOrderRepo.getLastThreeGuestsRoom(roomNumber);
    }

    @Override
    public List<BookingOrder> getListBookingOrders() {
        return bookingOrderRepo.getAll();
    }

    @Override
    public List<BookingOrder> getListGuestsAndTheirRoomsSortedByRoom() {
        return bookingOrderRepo.getListGuestsAndTheirRoomsSortedByRoom();
    }

    @Override
    public List<BookingOrder> getListGuestsAndTheirRoomsSortedByCheckOutDays() {
        return bookingOrderRepo.getListGuestsAndTheirRoomsSortedByCheckOutDays();
    }

    @Override
    public void saveNewBookingOrder(BookingOrder order) {
        bookingOrderRepo.save(order);
    }

    @Override
    public List<AdditionalService> getListAdditionalServiceOfGuestSortedByPrice(Integer guestID) {
        return bookingOrderRepo.getListAdditionalServiceOfGuestSortedByPrice(guestID);
    }
}
