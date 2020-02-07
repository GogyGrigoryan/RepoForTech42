package lesson19;

public class Subaru extends Car{
    Subaru(String model,Cartype type){
        setModel(model);
        setType(type);
    }

    @Override
    void startEngine() {
        if(isEngineState()){
            System.out.println("the Engine of Subaru is alreday turned on");
        }else{
            setEngineState(true);
            System.out.println("Now the engine of Subaru is turned on");
        }


    }

    @Override
    void stopEngine() {
        if (isEngineState()){
            setEngineState(false);
            System.out.println("Now the engine of Subaru is turned off");

        }else{
            System.out.println("Ooops the engine of Subaru is already turned off");
        }

    }
}
