package lesson19;

public class Horse {
    private int age;
    private String name;
    private int nogi;

    public Horse() {
    }

    public Horse(int age, String name, int nogi) {
        if (age < 0 || age > 150) {
            System.out.println("Возраст не корректный");
        } else {
            this.age = age;
        }
        this.name = name;
        this.nogi = nogi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("Возраст не корректный");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNogi() {
        return nogi;
    }

    public void setNogi(int nogi) {
        this.nogi = nogi;
    }
}
