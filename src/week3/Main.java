package week3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Week 3 Lab: Methods Assignment ---\n");

        // 1. printWelcome() дуудах (3 удаа)
        printWelcome();
        printWelcome();
        printWelcome();
        System.out.println();

        // 2. greet() өөр өөр 3 нэрээр дуудах
        greet("Bat");
        greet("Suvda");
        greet("Bold");
        System.out.println();

        // 3. printInfo() дуудах
        printInfo("Bat", 20);
        System.out.println();

        // 4. add() ашиглаж нийлбэр олох
        int sum = add(5, 7);
        System.out.println("Sum of 5 + 7 = " + sum);

        // 5. isAdult() шалгах
        System.out.println("Is 20 adult? " + isAdult(20));
        System.out.println("Is 15 adult? " + isAdult(15));

        // 6. sumFromOneToN(10) шалгах
        int totalSum = sumFromOneToN(10);
        System.out.println("Sum from 1 to 10 = " + totalSum);
        System.out.println();

        // 7. CalculateAll (Method дотор Method дуудах)
        calculateAll(10, 5);

        // 8. Square (Зассан хувилбар)
        int sq = square(4);
        System.out.println("Square of 4 = " + sq);
    }

    // --- БҮХ МЕТОДУУД (METHODS) ---

    // 1. Утга буцаахгүй (void) текст хэвлэх
    public static void printWelcome() {
        System.out.println("Welcome to Week 3 Lab Learning Java Methods");
    }

    // 2. Параметр авч мэндчилэх
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    // 3. Хоёр параметр авч хэвлэх
    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // 4. Хоёр тооны нийлбэр буцаах
    public static int add(int a, int b) {
        return a + b;
    }

    // 5. Нас шалгах (boolean буцаах)
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    // 6. 1-ээс N хүртэлх нийлбэр олох (loop ашиглан)
    public static int sumFromOneToN(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    // 7. Method дотор method дуудах хэсэг
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void calculateAll(int x, int y) {
        int s = add(x, y);      // add() дуудаж байна
        int m = multiply(x, y); // multiply() дуудаж байна
        System.out.println("Calculating all for " + x + " and " + y + ":");
        System.out.println("Addition result: " + s);
        System.out.println("Multiplication result: " + m);
    }

    // 8. Square (Алдааг засаж return нэмсэн хувилбар)
    public static int square(int x) {
        return x * x;
    }
}