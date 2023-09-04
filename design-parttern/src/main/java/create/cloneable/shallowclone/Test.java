package create.cloneable.shallowclone;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation zhangsan = new Citation();
        zhangsan.setName("zhangsan");
        Citation lisi = zhangsan.clone();
        lisi.setName("lisi");
        System.out.println(zhangsan);
        System.out.println(lisi);
    }
}
