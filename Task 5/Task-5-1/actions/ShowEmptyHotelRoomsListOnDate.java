package consoleuserinterface.actions;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import consoleuserinterface.ScannerUtil;

import java.time.LocalDate;

public class ShowEmptyHotelRoomsListOnDate implements IAction {
    AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

    @Override
    public void execute() {
        ScannerUtil scannerUtil = new ScannerUtil();
        System.out.println("Введите дату - ");
        System.out.println(adminControllerSingleton.getEmptyHotelRoomsListOnDate
                (LocalDate.of(LocalDate.now().getYear(), scannerUtil.getDateMonth(), scannerUtil.getDateDate())));
        System.out.println();
    }
}
