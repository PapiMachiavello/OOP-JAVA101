package week2;

public class Main {
    public static void main(String[] args) {
        System.out.println("1-ээс 10 хүртэлх тэгш тоонууд:");

        for (int i = 1; i <= 10; i++) {
            // Тэгш тоо эсэхийг шалгах
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}