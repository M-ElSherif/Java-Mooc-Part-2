
import java.util.*;

public class Tournament {

    private List<Jumper> jumpers;

    // CONSTRUCTOR
    public Tournament() {
        this.jumpers = new ArrayList<Jumper>();
    }

    //-------------------------------------------------------------
    // METHOD. Starts the user interface
    public void start(Scanner scanner) {
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        startJumperEntry(scanner);
        System.out.println();
        startRoundPhase(scanner);
        System.out.println();
    }

    //-------------------------------------------------------------
    // METHOD. Starts the jumper name entry interface
    public void startJumperEntry(Scanner scanner) {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {   // if input is empty, go to round phase
                break;
            }

            Jumper jumper = new Jumper(name, 0);
            this.jumpers.add(jumper);
        }
    }

    //-------------------------------------------------------------
    // METHOD. Starts the round phase
    public void startRoundPhase(Scanner scanner) {
        System.out.println("The tournament begins!");

        int j = 1;
        while (true) {
            System.out.println();
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                System.out.println();
                System.out.println("Thanks!");
                break;
            }

            if (input.equals("jump")) {
                System.out.println();
                System.out.println("Round " + j + "\n");
                System.out.println("Jumping order:");

                // sort the jumper list in ascending order
                Collections.sort(this.jumpers);

                for (int i = 0; i <= this.jumpers.size() - 1; i++) {
                    String name = this.jumpers.get(i).getJumperName();
                    int points = this.jumpers.get(i).getJumperPoints();
                    System.out.println("  " + (i+1) + ". " + name + " (" + points + " points)");
                }

                System.out.println();
                System.out.println("Results of round " + j);
                this.RoundPoints(); //******* Calls RoundPoints method to calculate points for each jumper
                j++;

            }
        }

        TournamentResults();
    }

    //---------------------------------------------------------------
    // METHOD. Calculates the points gained by each jumper in the round
    public void RoundPoints() {
        Round round = new Round();
        for (Jumper jumper : this.jumpers) {
            System.out.println("  " + jumper.getJumperName());
            int jumpLength = round.CalcLength();
            System.out.println("    length: " + jumpLength);    // print the jump length
            jumper.addLength(jumpLength);                     // add jump length to jumper's lengths list
            List<Integer> votes = round.CalcJudgeVotes();
            System.out.println("    judge votes: " + votes);

            int total = round.CalcTotal(votes, jumpLength);             // calculate the total
            int Points = jumper.getJumperPoints() + total;  // add the total to the previous point total
            jumper.setJumperPoints(Points);                 // set the new points total value to the jumper
        }
    }

    //---------------------------------------------------------------
    // METHOD. Calculates the tournament results and orders jumpers in 
    // descending order
    public void TournamentResults() {
        System.out.println();
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        
        Collections.sort(jumpers, new SortInDescending());
        
        int i = 1;
        for (Jumper jumper : jumpers) {

            System.out.println(i + "           " + jumper.getJumperName() + " (" + jumper.getJumperPoints() + " points)");
            List<Integer> lengths = jumper.getLengths();
            System.out.print("            jump lengths: ");
            for (int j = 0; j <= lengths.size() - 1; j++) {
                if (j != lengths.size() - 1) {
                    System.out.print(lengths.get(j) + " m, ");
                }
                else {
                    System.out.print(lengths.get(j) + " m");
                }
            }
            
            System.out.println();
            i++;
        }

    }

}

