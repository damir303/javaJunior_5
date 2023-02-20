package lesson12.bilet;

public class Book extends PrintPublis {
    private String avtor;

    public Book() {
    }

    public Book(String avtor) {
        this.avtor = avtor;
    }

    public Book(String name, int yearPubl, String publisher, String avtor, int count) {
        super(name, yearPubl, publisher,count);
        this.avtor = avtor;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        return avtor != null ? avtor.equals(book.avtor) : book.avtor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (avtor != null ? avtor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "avtor='" + avtor + '\'' +
                ", count=" + getCount() +
                ", Publisher=" + getPublisher() +
                ", Name=" + getName() +
                '}';
    }
}
