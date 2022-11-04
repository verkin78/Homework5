public class Main {
    public static void main(String[] args) {

        //task5.1//
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для IOS по ссылке ");}
        else if (clientOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке ");}
        else {System.out.println(" Ошибка ");}

        //task5.2//
        int client = 0;
        int clientDeviceYear = 2015;

        if (client == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для IOS по ссылке ");}
        else if (client == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегчённую версию приложения для IOS по ссылке ");}
        if (client == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке ");}
        else if (client == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегчённую версию приложения для Android по ссылке ");        }
        else {System.out.println(" Ошибка ");}

        //task5.3//
        int year = 2021;
        if (year %4 == 0 && year %100 != 0 || year %400 == 0) {
            System.out.println(year + " год является високосным ");}
        else {System.out.println(year + " год не является високосным ");}

        //task5.4//
        int deliveryDistance = 95;
        int day;
        if (deliveryDistance <= 20) {day = 1;
            System.out.println("Потребуется 1 день ");}
        else if (deliveryDistance > 20) {day = (deliveryDistance - 20) / 40 + 1;
            System.out.println("Потребуется " + day + " дня(ей) ");}

        //task5.5//
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(" Этот месяц относится к зиме ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Этот месяц относится к весне ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Этот месяц относится к лету ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Этот месяц относится к осени ");
                break;
            default:
                System.out.println(" Такого месяца нет ");
            }
    }
}