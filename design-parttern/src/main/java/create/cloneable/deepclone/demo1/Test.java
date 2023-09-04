package create.cloneable.deepclone.demo1;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setStudent(new Student("zhangsan", "beijing"));
        Citation citation1 = citation.clone();
        citation1.setStudent(new Student("lisi", "shanghai"));
        System.out.println(citation);
        System.out.println(citation1);
    }
}
