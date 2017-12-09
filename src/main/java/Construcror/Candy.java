package Construcror;

/**
 * Created by MY on 09.12.2017.
 */
public class Candy extends Staff {
    private String test;

    public Candy(String name, Double price, Double weight, String test) {
        super(name, price, weight);
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "2. Candy: [" + super.toString() + ", test = " + test + "]";
    }
}
