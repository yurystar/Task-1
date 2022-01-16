package consoleuserinterface;

import java.util.Scanner;

public class ScannerUtil {

    public Integer getInt() {
        Integer number = null;
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {
            System.out.print("Введите число: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                valid = true;
            } else {
                System.out.print("Это не число. Попробуйте еще раз.\n");
                input.next();
            }
        } while (valid == false);
        return number;
    }

    public String getStr() {
        String s = null;
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {
            System.out.print("Введите строку: ");
            if (input.hasNext()) {
                s = input.nextLine();
                valid = true;
            } else {
                System.out.print("Ошибка. Введите корректное предложение!\n");
                input.next();
            }
        } while (valid == false);
        return s;
    }

    public Integer getDateMonth() {
        Integer number = null;
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {
            System.out.print("Введите месяц (в формате - 01): ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0 && number < 13 && String.valueOf(Math.abs(number)).length() < 3) {
                    valid = true;
                } else System.out.print("Нет такого месяца или неправильный формат. Попробуйте еще раз.\n");
            } else {
                System.out.print("Это не число. Попробуйте еще раз.\n");
                input.next();
            }
        } while (valid == false);
        return number;
    }

    public Integer getDateDate() {
        Integer number = null;
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {
            System.out.print("Введите день (в формате - 01): ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0 && number < 32 && String.valueOf(Math.abs(number)).length() < 3) {
                    valid = true;
                } else System.out.print("Нет такого дня или неправильный формат. Попробуйте еще раз.\n");
            } else {
                System.out.print("Это не число. Попробуйте еще раз.\n");
                input.next();
            }
        } while (valid == false);
        return number;
    }
}
