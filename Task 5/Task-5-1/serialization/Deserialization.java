package com.senla.elhoteladmin.serialization;

import com.senla.elhoteladmin.entity.AdditionalService;
import com.senla.elhoteladmin.entity.BookingOrder;
import com.senla.elhoteladmin.entity.Guest;
import com.senla.elhoteladmin.entity.Room;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class Deserialization {

    public List<AdditionalService> deserializeAddServ() throws NullPointerException {

        String fileName = ".." + File.separator + "AdditionalService.ser";
        File file = new File(fileName);

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            List<AdditionalService> newList = (List<AdditionalService>) objectInputStream.readObject();
            System.out.println("AdditionalService storage loaded");

        return newList;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IOException exception");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception");
        }
        System.out.println("Not exist storage");
        return Collections.<AdditionalService>emptyList();
    }

    public List<BookingOrder> deserializeBookOrd() throws NullPointerException {

        String fileName = ".." + File.separator + "BookingOrder.ser";
        File file = new File(fileName);

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            List<BookingOrder> newList = (List<BookingOrder>) objectInputStream.readObject();
            System.out.println("BookingOrder storage loaded");

            return newList;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IOException exception");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception");
        }
        System.out.println("Not exist storage");
        return Collections.<BookingOrder>emptyList();
    }

    public List<Guest> deserializeGuest() throws NullPointerException {

        String fileName = ".." + File.separator + "Guest.ser";
        File file = new File(fileName);

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            List<Guest> newList = (List<Guest>) objectInputStream.readObject();
            System.out.println("Guest storage loaded");

            return newList;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IOException exception");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception");
        }
        System.out.println("Not exist storage");
        return Collections.<Guest>emptyList();
    }

    public List<Room> deserializeRoom() throws NullPointerException {

        String fileName = ".." + File.separator + "Room.ser";
        File file = new File(fileName);

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            List<Room> newList = (List<Room>) objectInputStream.readObject();
            System.out.println("Room storage loaded");

            return newList;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IOException exception");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception");
        }
        System.out.println("Not exist storage");
        return Collections.<Room>emptyList();
    }
}
