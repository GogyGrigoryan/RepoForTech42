package lesson19;

public class Kia extends Car {
Kia(String model, Cartype type){
    setModel(model);
    setType(type);
}

    @Override
    void startEngine() {
    if(isEngineState()){
        System.out.println("Engine is already started. ");
    }else {
        setEngineState(true);
        System.out.println("pleaseeeee, turned on the Engine");
    }

    }

    @Override
    void stopEngine() {
    if (isEngineState()){
        setEngineState(false);
        System.out.println("Engine is turned off");
    }else{
        System.out.println("The Engine is already turned off");
    }

    }
}
