package conectis.model;

public class Person {
    private long id;
    private String name;
    private String email;
    private static long counter = 1;

    public Person() {
        this.id = counter;
        counter ++;
    }

    public Person(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void setCounter(long counter) {
        Person.counter = counter;
    }
}
