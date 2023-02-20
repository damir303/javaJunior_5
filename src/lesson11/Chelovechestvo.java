package lesson11;

public class Chelovechestvo  {
    private int age = 1235233123;

    public Chelovechestvo() {
    }

    public Chelovechestvo(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override //анотация
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chelovechestvo that = (Chelovechestvo) o;

        return age == that.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public String toString() {
        return "Chelovechestvo{" +
                "age=" + age +
                '}';
    }
}
