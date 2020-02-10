package lesson20;

public class Animal implements MakeSound{
    private String name;
    private String voice;
    private Animal[]animalList;


    Animal(String name, String voice){
        this.name=name;
        this.voice=voice;
    }
//void addAnimal(Animal animal){
       // for (int i=0;i<animalList.length;i++){
      //      if (animalList[i]==null){
        //        animalList[i]=animal;
          //      break;
          //  }
        //}

//}
    @Override
    public String voice() {
        return name + " "+voice;
    }

    @Override
    public String toString() {
        return voice();
       // return "Animal{" +
         //       "name='" + name + '\'' +
           //     ", voice='" + voice + '\'' +
             //   '}';
    }
}
