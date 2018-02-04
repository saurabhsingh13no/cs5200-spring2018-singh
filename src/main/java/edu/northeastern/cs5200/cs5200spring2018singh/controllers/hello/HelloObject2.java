package edu.northeastern.cs5200.cs5200spring2018singh.controllers.hello;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="hello")
public class HelloObject2 {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloObject2(String message) {
        this.message = message;
    }

    public HelloObject2() {
    }
}
