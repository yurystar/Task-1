package consoleuserinterface.actions;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import consoleuserinterface.ScannerUtil;

public class DeleteBookingOrder implements IAction{
    AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

    @Override
    public void execute() {
        System.out.println("Введите номер заказа для удаления - ");
        adminControllerSingleton.deleteBookingOrder(new ScannerUtil().getInt());
        System.out.println("Заказ удален.");
    }
}
