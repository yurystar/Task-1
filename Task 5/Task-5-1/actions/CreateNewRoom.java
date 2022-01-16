package consoleuserinterface.actions;

import com.senla.elhoteladmin.entity.Room;
import com.senla.elhoteladmin.entity.RoomStatus;
import com.senla.elhoteladmin.entity.RoomType;
import com.senla.elhoteladmin.service.RoomService;
import consoleuserinterface.ScannerUtil;

import java.util.Scanner;

public class CreateNewRoom implements IAction {
    RoomService roomService = RoomService.getInstance();

    public RoomType selectRoomType() {
        System.out.println("Выберите из списка тип комнаты - \n" +
                RoomType.STARS_2 + " - Введите 1 \n" +
                RoomType.STARS_3 + " - Введите 2 \n" +
                RoomType.STARS_4 + " - Введите 3 \n" +
                "Введите 0 для выхода.");
        RoomType roomType = null;
        int number = -1;
        Scanner input = new Scanner(System.in);
        do {
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0 && number < 4) {
                    if (number == 1) {
                        roomType = RoomType.STARS_2;
                    } else if (number == 2) {
                        roomType = RoomType.STARS_3;
                    } else {
                        roomType = RoomType.STARS_4;
                    }
                } else if (number == 0) {
                    System.out.println("Выбор завершен.\n");
                } else System.out.println("Нет такого варианта выбора. Попробуйте еще раз.\n");
            } else {
                System.out.print("Это не число. Попробуйте еще раз.\n");
                input.next();
            }
        } while (number != 0);
        return roomType;
    }

    @Override
    public void execute() {
        ScannerUtil scanner = new ScannerUtil();
        Room room = new Room();

        System.out.println("Введите ID комнаты - ");
        room.setRoomID(scanner.getInt());

        System.out.println("Введите номер комнаты - ");
        Integer roomNum = scanner.getInt();
        for (Room roomsAll : roomService.getRoomList()) {
            if (roomsAll.getRoomNumber().equals(roomNum)) {
                System.out.println("Комната с таким номером уже существует.\n");
                return;
            } else room.setRoomNumber(roomNum);
        }

        System.out.println("Выберите тип комнаты - ");
        room.setRoomType(selectRoomType());

        System.out.println("Введите количество мест в комнате - ");
        room.setRoomPlaces(scanner.getInt());

        System.out.println("Введите цену комнаты - ");
        room.setRoomPrice(scanner.getInt());
        room.setRoomStatus(RoomStatus.EMPTY);
        System.out.println();

        roomService.setNewRoom(room);
        System.out.println("Комната - \n" + room + " \nсоздана.\n");
    }
}
