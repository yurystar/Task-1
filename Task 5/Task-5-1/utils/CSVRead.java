package consoleuserinterface.utils;

import com.senla.elhoteladmin.dao.RoomDaoImpl;
import com.senla.elhoteladmin.entity.Room;
import com.senla.elhoteladmin.entity.RoomStatus;
import com.senla.elhoteladmin.entity.RoomType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVRead {

    public static void CSVReadRoom() {
        RoomDaoImpl roomDao = RoomDaoImpl.getInstance();
        try (BufferedReader reader = new BufferedReader(new FileReader("..\\Room.csv"))) {

            String line = null;
            Scanner scanner = null;
            int index = 0;
            List<Room> roomArrayList = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                Room room = new Room();
                scanner = new Scanner(line);
                scanner.useDelimiter(",");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == 0)
                        room.setRoomID(Integer.parseInt(data));
                    else if (index == 1)
                        room.setRoomNumber(Integer.parseInt(data));
                    else if (index == 2)
                        room.setRoomType(RoomType.valueOf(data));
                    else if (index == 3)
                        room.setRoomPlaces(Integer.parseInt(data));
                    else if (index == 4)
                        room.setRoomPrice(Integer.parseInt(data));
                    else if (index == 5)
                        room.setRoomStatus(RoomStatus.valueOf(data));
                    else
                        System.out.println("Некорректные данные::" + data);
                    index++;
                }
                index = 0;
                roomArrayList.add(room);
            }
            System.out.println(roomArrayList);
            System.out.println();
            for (Room room : roomArrayList) {
                Room roomPresent = roomDao.getRoomByNum(room.getRoomNumber());
                if (roomPresent == null) {
                    roomDao.save(room);
                } else if (!room.equals(roomPresent)) {
                    roomPresent.setRoomID(room.getRoomID());
                    roomPresent.setRoomType(room.getRoomType());
                    roomPresent.setRoomPlaces(room.getRoomPlaces());
                    roomPresent.setRoomPrice(room.getRoomPrice());
                    roomPresent.setRoomStatus(room.getRoomStatus());
                    roomDao.update(room);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error read!");
        }
    }
}
