
import java.util.*;

public class Round {

    private List<Integer> judgeVotes; // make this an array in method instead 

    // CONSTRUCTOR
    public Round() {
        this.judgeVotes = new ArrayList<Integer>();
    }

    //-------------------------------------------------------------
    // METHOD. Returns the jumper' jump length points
    public int CalcLength() {
        Random random = new Random();
        int length = 60 + random.nextInt(121 - 60);

        return length;
    }

    //-------------------------------------------------------------
    // METHOD. Returns the 5 judges point votes
    public List<Integer> CalcJudgeVotes() {
        List<Integer> votes = new ArrayList<Integer>();
        Random random = new Random();
        int judgeVote = 0;

        for (int i = 1; i <= 5; i++) {
            judgeVote = 10 + random.nextInt(21 - 10);
            this.judgeVotes.add(judgeVote);
            votes.add(judgeVote);
        }
        Collections.sort(judgeVotes);
        Collections.sort(votes);
        return votes;
    }
    
    //-------------------------------------------------------------
    // GETTER. Get the judgeVotes araylist
    public List<Integer> getJudgeVotes() {
        return this.judgeVotes;
    }

    //-------------------------------------------------------------
    // METHOD. Sums the judge votes excluding the smallest and
    // largest to get the judge points
    public int CalcJudgePoints(List<Integer> votes) {
        int judgePoints = 0;

        for (int i = 1; i <= 3; i++) {
//            judgePoints += this.judgeVotes.get(i);
            judgePoints += votes.get(i);
        }
        return judgePoints;
    }

    //-------------------------------------------------------------
    // METHOD. Calculates the total points for the jumper
    public int CalcTotal(List<Integer> votes, int jumpLength) {
        int total = CalcJudgePoints(votes) + jumpLength;
        return total;
    }

}
