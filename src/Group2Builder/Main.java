package Group2Builder;

public class Main {
    public static void main(String[] args){
        Director director = new Director();

        ConcreteBuilder builder = new ConcreteBuilder();
        director.constructCat(builder);

        Animal animal = builder.getResult();
        System.out.println("Animal built: " + animal.getName()+".\n");

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructCat(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("Animal manual built: \n" + manual.print());
    }
}
