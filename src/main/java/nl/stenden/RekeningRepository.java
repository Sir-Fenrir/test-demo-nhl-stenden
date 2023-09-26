package nl.stenden;

import java.util.ArrayList;
import java.util.List;

/**
 * Onze 'repository' die wat data oplevert. Puur om een reden te hebben om het te mocken.
 */
public class RekeningRepository {

    public List<Rekening> getRekeningen() {
        Rekening rekening1 = new Rekening("ABC1", 10, "Henk");
        Rekening rekening2 = new Rekening("ABC2", 20, "Hank");
        Rekening rekening3 = new Rekening("ABC3", 30, "Honk");

        List<Rekening> rekeningen = new ArrayList<>();
        rekeningen.add(rekening1);
        rekeningen.add(rekening2);
        rekeningen.add(rekening3);

        return rekeningen;
    }

}
