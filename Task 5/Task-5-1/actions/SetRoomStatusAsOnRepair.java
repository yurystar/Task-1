package consoleuserinterface.actions;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import consoleuserinterface.ScannerUtil;

public class SetRoomStatusAsOnRepair implements IAction{
    AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

    @Override
    public void execute() {
        System.out.println("Введите номер комнаты - ");
        adminControllerSingleton.setRoomStatusAsOnRepair(new ScannerUtil().getInt());
        System.out.println("Статус изменен.\n");
    }
}
