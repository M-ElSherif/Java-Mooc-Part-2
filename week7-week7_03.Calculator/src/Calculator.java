
public class Calculator {

    private Reader reader;
    private int count;    // counts the number of operations done with the calculator obbject

    // CONSTRUCTOR
    public Calculator() {
        this.reader = new Reader();
        this.count = count;
    }

    public void start() {

        while (true) {
            System.out.println("command: ");
            String command = reader.readString();

            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                this.sum();
                this.count++;
            } else if (command.equals("difference")) {
                this.difference();
                this.count++;
            } else if (command.equals("product")) {
                product();
                this.count++;
            }
        }

        statistics();
    }

    // METHOD. Reads in value1 and value2
    private int[] reader() {
        
        int[] array = new int[2];
        
        System.out.println("value1: ");
        array[0] = this.reader.readInteger();
        System.out.println("value2: ");
        array[1] = this.reader.readInteger();
        
        return array;
    }

    // METHOD
    private void sum() {
        int[] array = this.reader();
        int calculation = array[0] + array[1];
        System.out.println("sum of the values " + calculation);
    }

    // METHOD
    private void product() {
        int[] array = this.reader();
        int calculation = array[0] * array[1];
        System.out.println("product of values " + calculation);
    }

    // METHOD
    private void difference() {
        int[] array = this.reader();
        int calculation = array[0] - array[1];
        System.out.println("difference of values " + calculation);
        
    }
    
    // METHOD
    private void statistics() {
        System.out.println("Calculation done " + this.count);
    }

}
