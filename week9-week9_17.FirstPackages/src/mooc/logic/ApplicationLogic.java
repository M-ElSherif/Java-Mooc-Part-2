package mooc.logic;

import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;

public class ApplicationLogic {

    private UserInterface ui;

    // CONSTRUCTOR
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    // METHOD
    public void execute(int howManyTimes) {

        for (int i = 1; i <= howManyTimes; i++) {
            System.out.println("The application logic works");
            ui.update();
        }
    }

}
