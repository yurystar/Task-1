package com.senla.elhoteladmin.serialization;

import com.senla.elhoteladmin.entity.AdditionalService;
import com.senla.elhoteladmin.entity.BookingOrder;
import com.senla.elhoteladmin.entity.Guest;
import com.senla.elhoteladmin.entity.Room;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialization {

    public void SerializeAddServ(List<AdditionalService> list) throws IOException {
        String fileName = ".." + File.separator + "AdditionalService.ser";
        File file = new File(fileName);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(list);

        objectOutputStream.close();
            System.out.println("AdditionalService - Serialize.");
    }

    public void SerializeBookOrd(List<BookingOrder> list) throws IOException {
        String fileName = ".." + File.separator + "BookingOrder.ser";
        File file = new File(fileName);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(list);

        objectOutputStream.close();
        System.out.println("BookingOrder - Serialize.");
    }

    public void SerializeGuest(List<Guest> list) throws IOException {
        String fileName = ".." + File.separator + "Guest.ser";
        File file = new File(fileName);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(list);

        objectOutputStream.close();
        System.out.println("Guest - Serialize.");
    }

    public void SerializeRoom(List<Room> list) throws IOException {
        String fileName = ".." + File.separator + "Room.ser";
        File file = new File(fileName);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(list);

        objectOutputStream.close();
        System.out.println("Room - Serialize.");
    }
}

