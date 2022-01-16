package consoleuserinterface.actions;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import com.senla.elhoteladmin.entity.*;
import consoleuserinterface.ScannerUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateBookingOrder implements IAction {
    AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

    private List<AdditionalService> createListAddServInOrder() {
        List<AdditionalService> listAll = adminControllerSingleton.getListAdditionalServices();
        List<AdditionalService> listOrder = new ArrayList<>();
        int number = -1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println(adminControllerSingleton.getListAdditionalServices());
            System.out.print("Введите ID дополнительного сервиса. Или введите 0 для выхода. -  ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0 && number <= listAll.size()) {
                    listOrder.add(listAll.get(number - 1));
                } else if (number == 0) {
                    System.out.println("Создание списка дополнительных сервисов завершено.\n");
                } else System.out.println("Нет такого ID. Попробуйте еще раз.\n");
            } else {
                System.out.print("Это не число. Попробуйте еще раз.\n");
                input.next();
            }
        } while (number != 0);
        listOrder.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        return listOrder;
    }

    private List<Guest> createListGuestsInOrder() {
        ScannerUtil scannerUtil = new ScannerUtil();
        List<Guest> listGuestInOrder = new ArrayList<>();
        int number = -1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Введите 1 для заполнения формы. Или введите 0 для выхода. -  ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number == 1) {
                    Guest guest = new Guest();
                    System.out.println("Введите ID гостя: ");
                    guest.setGuestID(scannerUtil.getInt());
                    System.out.println("Введите номер паспорта гостя: ");
                    guest.setGuestPassport(scannerUtil.getInt());
                    System.out.println("Введите имя гостя: ");
                    guest.setGuestName(scannerUtil.getStr());
                    System.out.println("Введите фамилию гостя: ");
                    guest.setGuestSurname(scannerUtil.getStr());
                    listGuestInOrder.add(guest);
//                    adminControllerSingleton.addGuestInStorage(guest);
                } else if (number == 0) {
                    System.out.println("Создание списка гостей завершено.");
                } else System.out.println("Нет такого выбора. Попробуйте еще раз.\n");
            } else {
                System.out.print("Это не число. Попробуйте еще раз.\n");
                input.next();
            }
        } while (number != 0);
        listGuestInOrder.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");
        return listGuestInOrder;
    }

    @Override
    public void execute() {
        ScannerUtil scannerUtil = new ScannerUtil();
        System.out.println("Введите ID заказа.");
        Integer orderID = scannerUtil.getInt();
        System.out.println("Введите дату заселения.");
        LocalDate orderCheckInDate =
                LocalDate.of(LocalDate.now().getYear(), scannerUtil.getDateMonth(), scannerUtil.getDateDate());
        System.out.println("Введите дату выселения.");
        LocalDate orderCheckOutDate =
                LocalDate.of(LocalDate.now().getYear(), scannerUtil.getDateMonth(), scannerUtil.getDateDate());
        System.out.println("Введите номер комнаты.");
        Room orderedHotelRoom = adminControllerSingleton.getRoomByNumber(scannerUtil.getInt());
        System.out.println("Введите поочередно ID дополнительных сервисов.");
        List<AdditionalService> orderedAdditionalServices = createListAddServInOrder();
        System.out.println("Введите поочередно данные гостей.");
        List<Guest> orderHotelGuests = createListGuestsInOrder();
        OrderStatus orderStatus = OrderStatus.BOOKING;
        BookingOrder order = new BookingOrder(orderID, orderCheckInDate, orderCheckOutDate, orderedHotelRoom,
                orderedAdditionalServices, orderHotelGuests, orderStatus);
        adminControllerSingleton.saveNewBookingOrder(order);
        System.out.println("Создан заказ " + orderID + ".");
        System.out.println(order);
        System.out.println("----------------------------------------------------------------------------");
    }
}
