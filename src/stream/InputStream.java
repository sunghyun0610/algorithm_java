package stream;

import java.io.*;

public class InputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("student.data"));
        Student s= (Student) ois.readObject();
        System.out.println(s);
    }



}
