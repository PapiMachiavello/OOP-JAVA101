package week4;

class Person {
    String name;
    int age;

    public void introduce() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // 3 хүнтэй анги
        Person s1 = new Person(); s1.name = "Zoloo"; s1.age = 19;
        Person s2 = new Person(); s2.name = "Naraa"; s2.age = 17;
        Person s3 = new Person(); s3.name = "Ganaa"; s3.age = 21;

        Person[] myClass = {s1, s2, s3};

        for (Person p : myClass) {
            p.introduce();
            if (p.age >= 18) System.out.println("-> Adult");
        }
    }
}