package lesson19;

public class Main {
    public static void main(String[] args) {
        Parking park=new Parking(3);
        Kia kia1=new Kia("Forte",Car.Cartype.Coupe);
        park.addCarInParking(kia1);
        //park.removeCar(2,0);
        park.getAllInfo();




    }

}
