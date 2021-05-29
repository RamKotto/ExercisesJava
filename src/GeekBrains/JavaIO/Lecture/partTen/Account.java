package GeekBrains.JavaIO.Lecture.partTen;

import java.io.Serializable;

public class Account implements Serializable {
    private String name;
    private String login;
    private transient String password;
}
