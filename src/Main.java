import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what you would like to sort by: region or aldersgruppe");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> winners = fh.loadAllWinners();

        String userInput = getUserInput();

        SortData sd = new SortData();

        winners = sd.sort(userInput);
        // display tour winners
        for (Covid19Data winner : winners) {
            System.out.println(winner);
        }
    }
}