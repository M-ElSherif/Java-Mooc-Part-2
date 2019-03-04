
public class Main {

    public static void main(String[] args) {
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('m', 'k'));
        scandiesAway.addChange(new Change('d', 'p'));
        System.out.println(scandiesAway.change("mama dede"));
    }
}
