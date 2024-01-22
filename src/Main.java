public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int yearToCheck = 2028;
        checkLeapYear(yearToCheck);
    }

    public static void checkLeapYear(int year) {
        if (year >= 1584 && year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        int clientDeviceYear = 2005;
        int clientOS = 1;
        checkDevice(clientDeviceYear, clientOS);

    }
    public static void checkDevice (int clientDeviceYear, int clientOS) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        int deliveryDistance = 50;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        printDeliveryDays(deliveryDays);

    }

    public static int calculateDeliveryDays(int distance) {
        int result = 1;
        if (distance > 20) {
            result++;
        }
        if (distance > 60) {
            result++;
        }
        if (distance > 100) {
            result = -1;
        }

        return result;
    }

    public static void printDeliveryDays(int deliveryDays) {
        if (deliveryDays < 1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }

    }
}