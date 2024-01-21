import java.util.concurrent.atomic.AtomicInteger;

public class Person implements Payable, Comparable<Person> {
    private static final AtomicInteger idGenerator = new AtomicInteger(1);

    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idGenerator.getAndIncrement();
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0.00;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }

    @Override
    public String toString() {
        return getPosition() + ": " + id + ". " + name + " " + surname;
    }
}
