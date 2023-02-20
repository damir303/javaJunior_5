package lesson12.bilet;

public class Journal extends PrintPublis {
    private int number;

    public Journal() {
    }

    public Journal(String name, int yearPubl, String publisher, int number, int count) {
        super(name, yearPubl, publisher, count);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Journal journal = (Journal) o;

        return number == journal.number;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "number=" + number +
                ", Publisher=" + getPublisher() +
                ", Name=" + getName() +
                ", count=" + getCount() +
                '}';
    }
}
