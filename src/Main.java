import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task();
//        task2();
//        task3();
//        task4();
        task5();
    }

   //Task1
    public static void task(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    //Task2
    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число1");
        int num1 = scanner.nextInt();
        System.out.println("Введите число2");
        int num2 = scanner.nextInt();
        System.out.println("Введите число3");
        int num3 = scanner.nextInt();

        System.out.println("Выберите действие: сумма/произведение");
        String action = scanner.next();

        switch (action){
            case "сумма" -> System.out.println(num1 + num2 + num3);
            case "произведение" -> System.out.println(num1 * num2 * num3);
        }
    }

    //Task3
    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число1");
        int num1 = scanner.nextInt();
        System.out.println("Введите число2");
        int num2 = scanner.nextInt();
        System.out.println("Введите число3");
        int num3 = scanner.nextInt();

        System.out.println("Выберите действие: 1 - минимум / 2 - максимум / 3 - среднее арифметическое");
        int action = scanner.nextInt();

        switch (action){
            case 1 -> {
                int min = num1;
                if(min > num2){
                    min = num2;
                }
                if(min > num3){
                    min = num3;
                }
                System.out.println("Минимальное значение равно " + min);
            }
            case 2 -> {
                int max = num1;
                if(max < num2){
                    max = num2;
                }
                if(max < num3){
                    max = num3;
                }
                System.out.println("Максимальное значение равно " + max);
            }
            case 3 -> {
                int sum = num1 + num2 + num3;
                System.out.println("Среднее арифметическое равно " + sum / 3);
            }
        }
    }

    //Task4
    public static void task4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество метров");

        int value = scanner.nextInt();

        System.out.println("Введите во что необходимо конвертировать (mile/inch/yard)");

        String str = scanner.next();

        switch (str){
            case "mile" -> System.out.println(value + "м в милях равно " + value / 1609.344);
            case "inch" -> System.out.println(value + "м в дюймах равно " + value / 0.02544);
            case "yard" -> System.out.println(value + "м в ярдах равно " + value / 0.9144);
        }
    }

    //Task5
    public static void task5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество часов (от 0 до 24)");

        int time = scanner.nextInt();
        if(time >= 0 && time < 6){
            System.out.println("Good Night");
        }
        if(time >= 6 && time < 13){
            System.out.println("Good Morning");
        }
        if(time >= 13 && time < 17){
            System.out.println("Good Day");
        }
        if(time >= 17 && time < 24){
            System.out.println("Good Evening");
        }
    }
}
