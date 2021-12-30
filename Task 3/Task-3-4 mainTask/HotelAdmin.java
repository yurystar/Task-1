package com.senla.elhoteladmin;

import java.util.Calendar;

public class HotelAdmin {
    static public void getPrice (int ... a) {
        int b = 0;
        for(int i = 0; i < a.length; i++) {
            b += a[i];
        }
            System.out.println("Стоимость номера и услуг в сутки - " + b);
    }


     public static void main(String[] args) {
         System.out.println("---------Первичный список комнат-----------");
         DBHotel.printHotelRooms();
         System.out.println("---------Первичный список допуслуг-----------");
         DBHotel.printAdditionalServices();

         HotelGuest Petrov_123456 = new HotelGuest("Петр", "Петров", 123456);
         HotelGuest Antonov_456871 = new HotelGuest("Антон", "Антонов", 456871);
         HotelGuest Marks_25841 = new HotelGuest("Mark", "Marks", 25841);
         HotelGuest Johnson_153665448 = new HotelGuest("John", "Johnson", 153665448);

         DBHotel.addHotelGuest(123456, Petrov_123456);
         DBHotel.addHotelGuest(456871, Antonov_456871);
         DBHotel.addHotelGuest(25841, Marks_25841);
         DBHotel.addHotelGuest(153665448, Johnson_153665448);
         System.out.println("---------Список гостей----------");
         DBHotel.printHotelGuests();
         System.out.println("---------Создать заказ----------");

         Check_in num_1 = DBHotel.hotelRoomList.get(2);
         Check_in serv_1 = DBHotel.additionalServicesList.get(1);
         Check_in serv_1_1 = DBHotel.additionalServicesList.get(2);
         Check_in guest_1 = Petrov_123456;
         Check_in guest_1_1 = Antonov_456871;
         guest_1.chek_inHotel(guest_1);
         guest_1_1.chek_inHotel(guest_1_1);
         getPrice(num_1.chek_inHotel(num_1), serv_1.chek_inHotel(serv_1), serv_1_1.chek_inHotel(serv_1_1));

         System.out.println("---------Проверить статус комнаты 3--------");
         DBHotel.printHotelRooms();
         System.out.println("---------Удалить комнату 4 и добавить комнату 7----------");
         DBHotel.deleteHotelRoom(3);
         DBHotel.addHotelRoom(
                 new HotelRoom(7,5, 7000,4,"Free"));
         DBHotel.printHotelRooms();
         System.out.println("---------Добавить комнату 4-----------");
         DBHotel.addHotelRoom(
                 new HotelRoom(4,3, 4000,4,"Free"));
         DBHotel.printHotelRooms();
         System.out.println("----------Отсортировать комнаты по номеру----------");
         DBHotel.sortHotelRooms();
         DBHotel.printHotelRooms();
         System.out.println("----------Освободить номер 3-----------");
         Check_out num_1_out = DBHotel.hotelRoomList.get(2);
         num_1_out.check_outHotel(num_1_out);
         DBHotel.printHotelRooms();
         System.out.println("---------Поставить номер 5 на ремонт-----------");
         Room_On_repair repair_4 = DBHotel.hotelRoomList.get(4);
         repair_4.HotelRoom_On_repair(repair_4);
         DBHotel.printHotelRooms();
         System.out.println("----------Убрать номер 5 с ремонта---------");
         repair_4.HotelRoom_Out_repair(repair_4);
         DBHotel.printHotelRooms();
         System.out.println("----------Изменить цену номера 3------------");
         DBHotel.changePriceRoom(2,3400);
         DBHotel.printHotelRooms();
         System.out.println("----------------------------------");
    }
}
