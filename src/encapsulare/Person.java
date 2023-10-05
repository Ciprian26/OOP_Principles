package encapsulare;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be between 0 and 150.");
        }
    }

    public void celebrateBirthday() {
        age++;
        System.out.println(name + " is celebrating their birthday! They are now " + age + " years old.");
    }
}
