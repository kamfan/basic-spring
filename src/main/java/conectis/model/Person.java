package conectis.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id // to jest klucz główny
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "email", length = 50, unique = true)
    private String email;

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
    }
}
