
public class Main {

    public static void main(String[] args) {


        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        
        for (int brick_weight = 1; brick_weight <= 100; brick_weight++ ) {
            Thing brick  = new Thing("Brick", brick_weight );
            Suitcase suitcase = new Suitcase(brick.getWeight());
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
                
    }
}
