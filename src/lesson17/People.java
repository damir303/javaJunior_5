package lesson17;

public class People {
    private int age;
    private String name;

    public People() {
    }

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age > 150) {
            throw new AgeExceptions("age > 150");
        }
        if (age < 0) {
            throw new ArithmeticException("age < 0");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
