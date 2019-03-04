public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService days = new CivilService();
        MilitaryService dayz = new MilitaryService(500);
        
        days.work();
        System.out.println(days.getDaysLeft());
        
        dayz.work();
        System.out.println(dayz.getDaysLeft());
    }
}
