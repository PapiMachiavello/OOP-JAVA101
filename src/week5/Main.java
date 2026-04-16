// 1. Course Class
package week5;
class Course {
    String courseName;
    int maxStudents;
    int currentStudents;

    Course(String name, int max) {
        this.courseName = name;
        this.maxStudents = max;
        this.currentStudents = 0;
    }

    void enrollStudent() {
        if (currentStudents < maxStudents) {
            currentStudents++;
            System.out.println(courseName + ": Амжилттай бүртгэгдлээ. (Одоо: " + currentStudents + ")");
        } else {
            System.out.println(courseName + ": Course is full!");
        }
    }
}

// 2. Product Class
class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void sell(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
            System.out.println(name + " " + amount + "ш зарагдлаа. Үлдэгдэл: " + quantity);
        } else {
            System.out.println(name + ": Not enough stock! (Үлдэгдэл: " + quantity + ")");
        }
    }
}

// 3. ATMAccount Class
class ATMAccount {
    String owner;
    double balance;

    ATMAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(owner + ": +" + amount + " орлого. Шинэ үлдэгдэл: " + balance);
    }

    void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Transaction declined: Үлдэгдэл хүрэлцэхгүй байна.");
        } else {
            balance -= amount;
            System.out.println(owner + ": -" + amount + " зарлага. Үлдэгдэл: " + balance);
        }
    }
}

// 4. Rectangle Class
class Rectangle {
    double width, height;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    double area() { return width * height; }
    double perimeter() { return 2 * (width + height); }
}

// 5. Player & Team Classes
class Player {
    String name;
    int score = 0;
    Player(String name) { this.name = name; }
    void addScore(int points) { this.score += points; }
}

class Team {
    String teamName;
    Player p1, p2;

    Team(String teamName, Player p1, Player p2) {
        this.teamName = teamName;
        this.p1 = p1;
        this.p2 = p2;
    }

    void printTeamScore() {
        System.out.println(teamName + " багийн нийт оноо: " + (p1.score + p2.score));
    }
}

// --- MAIN CLASS ---
public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Course Туршилт ---");
        Course java = new Course("Java Core", 3);
        for(int i=1; i<=4; i++) java.enrollStudent();

        System.out.println("\n--- 2. Product Туршилт ---");
        Product p1 = new Product("Laptop", 2500, 5);
        Product p2 = new Product("Mouse", 50, 2);
        p1.sell(3);
        p2.sell(3); // Stock хүрэхгүй

        System.out.println("\n--- 3. ATM ---");
        ATMAccount acc = new ATMAccount("Bold", 1000);
        acc.deposit(500); acc.deposit(200);
        acc.withdraw(300); acc.withdraw(2000); // Declined

        System.out.println("\n--- 4. Rectangle Туршилт ---");
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(7, 8);
        System.out.println("Rect1 талбай: " + rect1.area());
        System.out.println("Rect2 талбай: " + rect2.area());
        if(rect1.area() > rect2.area()) System.out.println("Rect1 илүү том.");
        else System.out.println("Rect2 илүү том.");

        System.out.println("\n--- 5. Team Туршилт ---");
        Player a = new Player("Anu");
        Player b = new Player("Bat");
        Team teamX = new Team("Dream Team", a, b);
        a.addScore(50);
        b.addScore(30);
        teamX.printTeamScore();
    }
}