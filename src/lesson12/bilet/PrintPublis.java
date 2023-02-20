package lesson12.bilet;

public class PrintPublis {
    private String name;
    private int yearPubl;
    private String publisher;
    private int count;

    public PrintPublis() {
    }

    public PrintPublis(String name, int yearPubl, String publisher, int count) {
        this.name = name;
        this.yearPubl = yearPubl;
        this.publisher = publisher;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearPubl() {
        return yearPubl;
    }

    public void setYearPubl(int yearPubl) {
        this.yearPubl = yearPubl;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintPublis that = (PrintPublis) o;

        if (yearPubl != that.yearPubl) return false;
        if (count != that.count) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return publisher != null ? publisher.equals(that.publisher) : that.publisher == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + yearPubl;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + count;
        return result;
    }



    public static PrintPublis printFatPublish(PrintPublis[] mass) {
        PrintPublis res = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (res.getCount() < mass[i].getCount()) {
                res = mass[i];
            }
        }
        return res;
    }

    public static PrintPublis printFatBook(PrintPublis[] mass) {
        PrintPublis res = null;
        for (PrintPublis pub: mass){
            if(pub instanceof Book){
                if(res == null){
                    res = pub;
                }
                else {
                    if (res.getCount() < pub.getCount()) {
                        res = pub;
                    }
                }
            }
        }
        return res;
    }


}
