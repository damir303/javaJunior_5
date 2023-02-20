package lesson17;

public class Avtobus {
    private People driver;

    public People getDriver() {
        return driver;
    }

    public void setDriver(int i) throws Exception {
        this.driver = new People();
        driver.setAge(i);
    }
}
