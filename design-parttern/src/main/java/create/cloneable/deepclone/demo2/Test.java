package create.cloneable.deepclone.demo2;

import java.io.*;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation citation = new Citation();
        citation.setStudent(new Student("zhangsan", "beijing"));
        String file = "a.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(citation);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Citation citation1 = (Citation) ois.readObject();
        citation1.setStudent(new Student("lisi", "shanghai"));
        System.out.println(citation);
        System.out.println(citation1);
    }
}
