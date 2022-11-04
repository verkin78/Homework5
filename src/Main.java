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

    }
}