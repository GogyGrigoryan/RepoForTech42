package lesson20;

public class Main {
    public static void main(String[] args) {
        Animal cat=new Animal("Kisa","Miauu");
        Animal dog=new Animal("Xabshik","Haf");
        Phone iPhone=new Phone("11", Phone.phoneType.IOS);
        Phone samsung=new Phone("s10", Phone.phoneType.Android);
      //  Animal []animals=new Animal[5];

        samsung.takePhoto(cat);
        iPhone.takePhoto(cat);
        iPhone.takePhoto(dog);
      //  iPhone.takePhoto(animals);
    }
}
