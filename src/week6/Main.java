// 1. ATMAccount Class - Лимит болон үлдэгдэл хянах
package week6;
class ATMAccount {
    private String owner;
    private double balance;
    private double dailyWithdrawLimit;
    private double withdrawnToday;

    public ATMAccount(String owner, double balance, double limit) {
        this.owner = owner;
        this.balance = balance;
        this.dailyWithdrawLimit = limit;
        this.withdrawnToday = 0;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("ATM [" + owner + "]: Гүйлгээ амжилтгүй. Үлдэгдэл хүрэлцэхгүй.");
        } else if (withdrawnToday + amount > dailyWithdrawLimit) {
            System.out.println("ATM [" + owner + "]: Daily limit exceeded! Өдрийн лимит хэтэрсэн.");
        } else {
            balance -= amount;
            withdrawnToday += amount;
            System.out.println("ATM [" + owner + "]: " + amount + " зарлага амжилттай. Үлдэгдэл: " + balance);
        }
    }

    public double getBalance() { return balance; }
}

// 2. Employee Class - Цалингийн доод хэмжээ болон бонус хянах
class Employee {
    private String name;
    private double baseSalary;
    private double bonus;
    private final double MINIMUM_WAGE = 660000;

    public Employee(String name) {
        this.name = name;
        this.bonus = 0;
    }

    public void setBaseSalary(double salary) {
        if (salary >= MINIMUM_WAGE) {
            this.baseSalary = salary;
        } else {
            System.out.println("Employee [" + name + "]: Алдаа! Цалин доод хэмжээнээс бага байж болохгүй.");
        }
    }

    public void addBonus(double amount) {
        if (amount >= 0) {
            this.bonus += amount;
        } else {
            System.out.println("Employee [" + name + "]: Алдаа! Бонус сөрөг утгатай байж болохгүй.");
        }
    }

    public double getTotalSalary() {
        return baseSalary + bonus;
    }

    public String getName() { return name; }
}

// 3. Candidate Class - Санал хураалтын логик
class Candidate {
    private String name;
    private int votes;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }

    public void addVote() {
        this.votes++;
    }

    public int getVotes() { return votes; }
    public String getName() { return name; }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1. ATM ===");
        ATMAccount myAcc = new ATMAccount("Bold", 1000000, 500000);
        myAcc.withdraw(300000); // Амжилттай
        myAcc.withdraw(300000); // Лимит хэтэрнэ (300к + 300к > 500к)

        System.out.println("\n=== 2. Employee Туршилт ===");
        Employee emp1 = new Employee("Sanaa");
        emp1.setBaseSalary(500000); // Алдаа (Min wage-ээс бага)
        emp1.setBaseSalary(800000); // Амжилттай
        emp1.addBonus(120000);
        emp1.addBonus(-5000);       // Алдаа (Сөрөг бонус)
        System.out.println(emp1.getName() + "-ийн нийт цалин: " + emp1.getTotalSalary());

        System.out.println("\n=== 3. Candidate ===");
        Candidate c1 = new Candidate("Дорж");
        Candidate c2 = new Candidate("Сүрэн");

        // Санал өгөх процесс
        c1.addVote();
        c1.addVote();
        c2.addVote();
        c2.addVote();
        c2.addVote();

        System.out.println(c1.getName() + ": " + c1.getVotes() + " санал");
        System.out.println(c2.getName() + ": " + c2.getVotes() + " санал");

        if (c1.getVotes() > c2.getVotes()) {
            System.out.println(">>> Ялагч: " + c1.getName());
        } else if (c2.getVotes() > c1.getVotes()) {
            System.out.println(">>> Ялагч: " + c2.getName());
        } else {
            System.out.println(">>> Санал тэнцлээ.");
        }
    }
}