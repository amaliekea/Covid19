import java.util.ArrayList;
import java.util.Collections;

public class SortData {
    public ArrayList<Covid19Data> sort(String criteria) {
        ArrayList<Covid19Data> covid = new FileHandler().loadAllWinners();

        if (criteria.equals("region")) {
            Collections.sort(covid, new RegionComparator());
        } else if (criteria.equals("aldersGruppe")) {
            Collections.sort(covid, new AldersGruppeComparator());
        }

        for (Covid19Data data : covid) {
            System.out.println(data);
        }
        return covid;
    }
}