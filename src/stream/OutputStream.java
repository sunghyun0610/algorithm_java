package stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        Student s = new Student("그렙", 20);
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("student.data"));
        oos.writeObject(s);
        oos.close();


    }
}
