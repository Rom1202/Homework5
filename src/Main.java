public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientIos = 1;
        if (clientIos == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке ");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientIos = 0;
        int clientDeviceYear = 2015;
        if (clientIos == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную верисию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите  верисию приложения для IOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную верисию приложения для Android по ссылке");
            } else {
                System.out.println("Установите  верисию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2182;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год являеется високосным");
        } else {
            System.out.println(year + " год не является високостным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
    int deliveryDistance = 101;
    int deliveryDays = 1;
    if (deliveryDistance > 20) {
        deliveryDays++;
    }
    if (deliveryDistance > 60) {
        deliveryDays++;
    }
        System.out.println("Потребуется дней " + deliveryDays);
    if (deliveryDistance > 100)
        System.out.println("Доставки нет");
    }

    public static void task5() {
        System.out.println("Задача 5");
    int monthNumber = 12;
    switch (monthNumber) {
        case 1:
            System.out.println("Январь.Принадлежит к сезону зима");
            break;
        case 2:
            System.out.println("Февраль.Принадлежит к сезону зима");
            break;
        case 3:
            System.out.println("Март.Принадлежит к сезону весна");
            break;
        case 4:
            System.out.println("Апрель.Принадлежит к сезону весна");
            break;
        case 5:
            System.out.println("Май.Принадлежит к сезону весна");
            break;
        case 6:
            System.out.println("Июнь.Принадлежит к сезону лето");
            break;
        case 7:
            System.out.println("Июль.Принадлежит к сезону лето");
            break;
        case 8:
            System.out.println("Август.Принадлежит к сезону лето");
            break;
        case 9:
            System.out.println("Сентябрь.Принадлежит к сезону осень");
            break;
        case 10:
            System.out.println("Октябрь.Принадлежит к сезону осень");
            break;
        case 11:
            System.out.println("Ноябрь.Принадлежит к сезону осень");
            break;
        case 12:
            System.out.println("Декабрь.Принадлежит к сезону зима");
            break;
        default:
            System.out.println("Такого месяца не существует!");
    }
    }
    }


