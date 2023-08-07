package file;

import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile implements Serializable{
    private static final long serialUID = 12345678;

    public static <E> List<E> readFile(String path) {
        List<E> userList = new ArrayList<>();
        File file = new File(path);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            userList = (List<E>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.print("");
        }
        return userList;
    }

    public static <E> void write(List<E> userList, String path) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            objectOutputStream.writeObject(userList);
        } catch (IOException ignored) {
        }
    }
}
