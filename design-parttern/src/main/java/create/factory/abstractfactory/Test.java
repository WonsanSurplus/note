package create.factory.abstractfactory;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 * 偷懒去掉商店了
 */
public class Test {
    public static void main(String[] args) {
        AstoreFactory astoreFactory = new AstoreFactory();
        astoreFactory.getFruit().show();
        astoreFactory.getDrink().show();
        BstoreFactory bstoreFactory = new BstoreFactory();
        bstoreFactory.getDrink().show();
        bstoreFactory.getFruit().show();
    }
}
