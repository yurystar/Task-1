package consoleuserinterface.actions;

import com.senla.elhoteladmin.entity.Room;
import com.senla.elhoteladmin.service.RoomService;
import consoleuserinterface.ScannerUtil;

public class DeleteRoom implements IAction {
    RoomService roomService = RoomService.getInstance();

    @Override
    public void execute() {
        System.out.println("Введите номер комнаты для удаления - ");
        Room room = roomService.getRoomByNumber(new ScannerUtil().getInt());
        if (room != null) {
            roomService.deleteRoom(room);
        }
        System.out.println("Комната \n" + room + "\nудалена.\n");
    }
}
