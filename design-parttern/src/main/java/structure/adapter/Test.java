package structure.adapter;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SanDiskSD sanDiskSD = new SanDiskSD();
        sanDiskSD.writeSd("san");
        System.out.println(computer.readSD(sanDiskSD));

        //要读取大迈TF卡的内容
        AdapterTF adapterTF = new AdapterTF(new DMTFcard());
        System.out.println(computer.readSD(adapterTF));

        //要读取大迈TF卡的内容
        AdapterTF_Class adapterTF1 = new AdapterTF_Class();
        System.out.println(computer.readSD(adapterTF1));


    }

}
