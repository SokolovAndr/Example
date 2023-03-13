import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//часть 1 (раскрыть этот комментарий)

public class Main {
    public static void main(String[] args) {
        //для быстрого космментирования Ctrl + /
        //ввод и считывание данных
        /*
        Scanner scan = new Scanner(System.in); //для получения данных от пользователя
        System.out.println("Введите имя:");
        String username = scan.nextLine(); //для получения строки
        System.out.println("Введите возраст:");
        int age = scan.nextInt(); //для получения int
        System.out.println("Привет, " + username + ", ваш возраст: " + age);
        */
        //if else конструкция
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите роль: ");
        String role = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String pass = scanner.nextLine();
        if(role.equals("Admin") && pass.equals("12345"))
            System.out.println("Вход в систему, пожалуйста подождите..");
        else
            System.out.println("Неверный пользователь или пароль!");
        */
        //конструкция switch
        /*
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            default:
                System.out.println("default");
        }
        */
        //Калькулятор со switch case
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int num2 = scanner.nextInt();

        int res;

        System.out.print("Действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action){
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if(num2 == 0)
                    System.out.println("Ошибка!!");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Неверный формат ввода ");
        }
        */
        //цикл for
        /*for (int i=0; i<10; i++)
        {
            System.out.println("Элемент " + i);
        }
        for (float i=100; i>=0; i -=10)
        {
            System.out.println("Элемент " + i);
        }
         */
        //цикл while
        /*int i = 0;
        while(i<10)
        {
            System.out.println("Элемент "+ i);
            i++;
        }
         */
        //цикл do while
        /*int i = 100;
        do {
            System.out.println("Элемент "+ i);
            i*=100;
        }
        while (i<10);
         */
        //массивы одномерные
        /*
        int[] nums = new int[5];
        nums[0]= 1;
        nums[1]= 2;
        nums[2]= 3;
        nums[3]= 4;
        nums[4]= 5;
        int res = nums[0] + nums[1];
        System.out.println(res);

        float[] nums2 = new float[]{5.0f, 6.45f, 89.898f};
        System.out.println(nums2[1]);

        for (int i = 0; i<nums2.length; i++) {
            System.out.println("Элемент: " + nums2[i]);
        }

        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<arr.length;i++){
            System.out.print("Введите число: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }
        int min = arr[0];
        for (int i=0; i<arr.length;i++){
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimal: " + min);
         */
        //массивы многомерные
        /*
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][]{
                {5,7},
                {6,8},
                {1,2}
        };
        System.out.println(nums[1][1]);
         */
        //коллекции в Java - ArrayList
        /*
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1,30); //вставляем элемент по индексу

        for (Integer el : numbers)  //вариант цикла - аналог foreach из C#
            System.out.println(el);

        System.out.println(numbers.size()); //для вывода размера коллекции

        System.out.println(numbers.get(0)); //для вывода отдельного элемента по индексу

        //numbers.remove(1);    // удаление по индексу
        //numbers.clear();      //очистка коллекции
         */
        //коллекции в Java - LinkedList (особо разницы в ArrayList нет)
        /*
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(65.66f);
        numbers.add(100.55f);

        for (float el : numbers)
            System.out.println(el);
         */
        //функции пример 1
        /*
        info("Hello");
        String java = "Java";
        info(java);
        info("");

         */
        //функции пример 2
        /*
        short num = 9;
        summa((short) 5, num );
        int result1 = summa2((short) 5, num );
        System.out.println("Ввывели две функции, одна -войд, другая -инт");

        short num2 = 8;
        summa((short) 4, num2 );
        int result2 = summa2((short) 4, num2 );
        System.out.println("Ввывели две функции, одна -войд, другая -инт");
        info(String.valueOf(result2)); //преобразовали в строку
         */
        //функции пример 3
        byte[] nums1 = new byte[]{5,6,8};
        int summ1 = summaArray(nums1);
        System.out.println("Сумма 1: " + summ1);

        byte[] nums2 = new byte[]{7,8,9};
        int summ2 = summaArray(nums2);
        System.out.println("Сумма 2: " + summ2);
    }

    public static void summa(short a, short b)
    {
        int res = a+b;
        String result = "Результат: " + res;
        info(result);
    }

    public static int summa2(short a, short b)
    {
        int res = a+b;
        String result = "Результат: " + res;
        info(result);
        return res;
    }

    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }

    public static int summaArray(byte[] arr){
        int summa = 0;
        for (byte i=0; i<arr.length; i++){
            summa += arr[i];
        }
        return summa;
    }

}