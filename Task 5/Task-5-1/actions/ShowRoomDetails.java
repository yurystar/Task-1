package consoleuserinterface.actions;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import consoleuserinterface.ScannerUtil;

public class ShowRoomDetails implements IAction {
    AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

    @Override
    public void execute() {
        System.out.println("Введите номер комнаты - ");
        System.out.println(adminControllerSingleton.showRoomDetails(new ScannerUtil().getInt()));
        System.out.println();
    }
}
