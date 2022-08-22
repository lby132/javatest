package main.java2.inoutput;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class SuperUserInfo {
    String name;
    String password;

    public SuperUserInfo() {
        this("Unknown", "1111");
    }

    public SuperUserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class UserInfo2 extends SuperUserInfo implements java.io.Serializable {
    int age;

    public UserInfo2() {
        this("Unknown", "1111", 0);
    }

    public UserInfo2(String name, String password, int age) {
        super(name, password);
        this.age = age;
    }

    public String toString() {
        return "(" + name + "," + password + "," + age + ")";
    }

    public void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(password);
        out.defaultWriteObject();
    }

    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        password = in.readUTF();
    }
}
