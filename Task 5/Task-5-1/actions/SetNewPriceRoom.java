package consoleuserinterface.actions;

import com.senla.elhoteladmin.service.RoomService;
import consoleuserinterface.ScannerUtil;

public class SetNewPriceRoom implements IAction {
    RoomService roomService = RoomService.getInstance();

    @Override
    public void execute() {
        ScannerUtil scannerUtil = new ScannerUtil();

        System.out.println("Введите номер комнаты и новую цену- ");
        roomService.setNewPriceRoom(scannerUtil.getInt(), scannerUtil.getInt());
        System.out.println("Новая цена установлена.\n");
    }
}
