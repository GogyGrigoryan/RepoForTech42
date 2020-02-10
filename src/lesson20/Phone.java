package lesson20;

public class Phone implements MakePhoto{
    private phoneType type;
    private String model;
    private boolean silentMode;


    public phoneType getType() {
        return type;
    }

    public void setType(phoneType type) {
        this.type = type;
    }

    Phone(String model, phoneType type){
        this.model=model;
        this.type=type;

    }

    @Override
    public void takePhoto(Object object) {
        if (silentMode){
            System.out.println(voice());
        }
        System.out.println("Phone tooke photo");
        System.out.println(object.toString());

    }

    @Override
    public String voice() {
        switch (type){
            case IOS:
                return "Apple voice";
            case Android:
                return "Android voice";
            default:
                return "Unknown voice";
        }

    }

    enum phoneType{
        IOS,Android
    }
}
