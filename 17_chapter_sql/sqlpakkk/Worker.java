package sqlpakkk;

import java.sql.Date;

/**
 * Created by Козак on 10.11.2016.
 */
public class Worker {

    private int id;
    private String name;
    private String password;
    private String email;
    private int age;
    private int phone;
    private Date date;

    public Worker() {}

    public Worker(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Worker(int id, String name, String password, String email, int age, int phone, Date date) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Worker: {"+id+"\t"+name+"\t"+password+"\t"+email+"\t"+age+" years old\t"+phone+"\t created "+date+"}";
    }
}
