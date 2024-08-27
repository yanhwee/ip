package gray;

import java.io.*;

public class Utility {

    /**
     * Serialises the object to the file.
     *
     * @param file
     * @param obj
     * @throws IOException
     */
    public static void serialise(File file, Serializable obj) throws IOException {
        FileOutputStream f = new FileOutputStream(file);
        ObjectOutput s = new ObjectOutputStream(f);
        s.writeObject(obj);
        s.flush();
        s.close();
        s.close();
    }

    /**
     * Deserialises an object from the file.
     *
     * @param file
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object deserialise(File file) throws IOException, ClassNotFoundException {
        FileInputStream in = new FileInputStream(file);
        ObjectInputStream s = new ObjectInputStream(in);
        Object obj = s.readObject();
        s.close();
        in.close();
        return obj;
    }
}
