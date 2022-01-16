package consoleuserinterface.actions;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import consoleuserinterface.ScannerUtil;

public class SetRoomStatusAsEmpty implements IAction {
    AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

    @Override
    public void execute() {
        System.out.println("Введите номер комнаты - ");
        adminControllerSingleton.setRoomStatusAsEmpty(new ScannerUtil().getInt());
        System.out.println("Статус изменен. \n");
    }
}
