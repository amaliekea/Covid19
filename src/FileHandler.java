import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("Covid19.2.0.csv");

    public ArrayList<Covid19Data> loadAllWinners() {
        ArrayList<Covid19Data> covid = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            sc.nextLine();  // Skip første linje

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Covid19Data winner = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();    // Split linje og læg tokens i attributter
            String[] attributes = line.split(";");
            winner = new Covid19Data(
                    attributes[0], // region
                    attributes[1], // aldersGruppe
                    Integer.parseInt(attributes[2]), // dode
                    0, // intensiv
                    0, // indlagte
                    "" // dato
            );

            covid.add(winner);

        }
        sc.close();
        return covid;

    }
}
