package consoleuserinterface.actions;

import com.senla.elhoteladmin.service.BookingOrderService;
import consoleuserinterface.ScannerUtil;

public class ShowLastThreeGuestsRoom implements IAction {
    BookingOrderService bookingOrderService = BookingOrderService.getInstance();

    @Override
    public void execute() {
        System.out.println("Введите номер комнаты - \n");
        System.out.println("Список 3-х последних постояльцев комнаты - \n" +
                bookingOrderService.getLastThreeGuestsRoom(new ScannerUtil().getInt()));
    }
}
