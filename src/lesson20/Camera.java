package lesson20;

public class Camera implements MakePhoto{

    @Override
    public void takePhoto(Object object) {
        voice();

    }

    @Override
    public String voice() {
        return "Camera voice";
    }
}
