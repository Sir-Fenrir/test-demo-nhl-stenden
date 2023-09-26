package nl.stenden;

import java.util.List;

/**
 * De klasse die we gaan testen. Er zit een beetje logica in (zoeken) om het een beetje interessant te maken
 */
public class RekeningService {

    private RekeningRepository rekeningRepository;

    public RekeningService(RekeningRepository rekeningRepository) {
        this.rekeningRepository = rekeningRepository;
    }

    public Rekening findRekening(String rekeningNummer) {
        List<Rekening> rekeningen = rekeningRepository.getRekeningen();

        Rekening result = null;

        for (Rekening r :
                rekeningen) {
            if (r.getRekeningNummer().equals(rekeningNummer)) {
                result = r;
            }
        }

        return result;
    }

}
