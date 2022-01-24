package com.senla.elhoteladmin.serialization;

import com.senla.elhoteladmin.dao.AdditionalServiceDaoImpl;
import com.senla.elhoteladmin.dao.BookingOrderDaoImpl;
import com.senla.elhoteladmin.dao.GuestDaoImpl;
import com.senla.elhoteladmin.dao.RoomDaoImpl;
import com.senla.elhoteladmin.entity.Guest;
import com.senla.elhoteladmin.entity.Room;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WrapperSerialize {

    public void Serialize() throws IOException {
        String fileName = ".." + File.separator + "allEntity.ser";
        File file = new File(fileName);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream
                (new FileOutputStream(file, true))) {
            objectOutputStream.writeObject(AdditionalServiceDaoImpl.getInstance().getAll());
            objectOutputStream.writeObject(BookingOrderDaoImpl.getInstance().getAll());
            objectOutputStream.writeObject(GuestDaoImpl.getInstance().getAll());
            objectOutputStream.writeObject(RoomDaoImpl.getInstance().getAll());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        System.out.println("Room - Serialize.");
    }
}
