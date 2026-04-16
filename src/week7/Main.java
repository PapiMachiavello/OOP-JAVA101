package week7;

// 1. Student Class
class Student {
    private String name;
    private int age;

    public Student() {
        this("Unknown", 0);
    }

    public Student(String name) {
        this(name, 0);
    }

    public Student(String name, int age) {
        this.name = name;
        // Age validation
        if (age < 0) this.age = 0;
        else if (age > 120) this.age = 120;
        else this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

// 2. BankAccount Class
class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        if (owner == null || owner.isEmpty()) {
            this.owner = "Unknown";
        } else {
            this.owner = owner;
        }

        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Гүйлгээ амжилтгүй: Үлдэгдэл хүрэлцэхгүй.");
        }
    }

    public double getBalance() { return balance; }
    public String getOwner() { return owner; }
}

// 3. Product Class
class Product {
    private String name;
    private double price;
    private String description;

    public Product(String name, double price) {
        this(name, price, "No description");
    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}

// 4. Main Class
public class Main {
    public static void main(String[] args) {
        // Student шалгах
        Student s1 = new Student();
        Student s2 = new Student("Bold", 150);
        System.out.println("--- Student Check ---");
        System.out.println("S1 Name: " + s1.getName() + ", Age: " + s1.getAge());
        System.out.println("S2 Name: " + s2.getName() + ", Age: " + s2.getAge());

        // BankAccount шалгах
        System.out.println("\n--- BankAccount Check ---");
        BankAccount acc = new BankAccount(null, -500);
        System.out.println("Owner: " + acc.getOwner() + ", Balance: " + acc.getBalance());
        acc.deposit(1000);
        acc.withdraw(200);
        System.out.println("New Balance: " + acc.getBalance());

        // Product шалгах
        System.out.println("\n--- Product Check ---");
        Product p = new Product("Apple", 1500);
        System.out.println("Product '" + "Apple" + "' үүсгэгдлээ.");
    }
}