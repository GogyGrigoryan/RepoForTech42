package lesson20;

public class PC implements MakePhoto {
    @Override
    public void takePhoto(Object object) {
        voice();

    }

    @Override
    public String voice() {
        return "PC voice";
    }
}
