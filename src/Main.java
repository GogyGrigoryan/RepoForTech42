public class Main {
    public static void main(String[] args) {
        Hr hr1=new Hr("Davit","Davtyan",20000,4);
        Developer dev1=new Developer("Hovo","Switch",10000000,2);
        hr1.salaryCount();
        System.out.println(hr1);
        System.out.println(dev1);
        System.out.println(hr1.getInfo());

    }
}
