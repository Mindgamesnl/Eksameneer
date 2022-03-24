package nl.hhs;

import java.util.ArrayList;

public class GeslotenVraag extends Vraag {
    public GeslotenVraag(Examen examen, String inhoud, String correcteAnwoord, Antwoord antwoord) {
        super(examen, inhoud, correcteAnwoord, antwoord);
    }

    public ArrayList<String> getAntwoorden(){
        // gesloten vraag is toch ja/nee vraag?
        return new ArrayList<String>();
    }
}
