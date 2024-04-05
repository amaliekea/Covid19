import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> winners = fh.loadAllWinners();

        // display tour winners
        for (Covid19Data winner: winners) {
            System.out.println(winner);
        }
    }
    }