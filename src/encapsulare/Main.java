package encapsulare;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);

        System.out.println("Initial Info:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setAge(30);
        System.out.println("\nUpdated Age: " + person.getAge());

        person.setAge(200);
        System.out.println("\nInfo after Invalid Age Update:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.celebrateBirthday();
    }
}
