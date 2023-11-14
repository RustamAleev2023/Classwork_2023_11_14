import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task();
//        task2();
        task3();
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
}
