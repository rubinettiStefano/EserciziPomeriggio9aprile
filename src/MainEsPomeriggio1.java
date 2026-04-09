import java.util.ArrayList;
import java.util.List;

public class MainEsPomeriggio1
{
    static void main() {


        List<Expirable> l = new ArrayList<>();
        //possessore,tipo,quando è stata rilasciata
        //suggerimento (le date devono essere LocalDate come proprieta)]
        //le patenti scadono dopo 10 anni dal rilascio

        //metodi plus e isBefore delle date
        //aggiungere 10 anni alla data e vedere se viene prima di oggi
        l.add(new Patente("Stefano Rubinetti","A1","2011-11-08"));
        l.add(new Patente("Pippo Franco","B2","2025-12-13"));
        l.add(new Patente("Gianni Pinotto","A1","2017-09-07"));


        //yogurt -> marca,gusto,dataacquisto,giorniprimadiscadenza
        //gli yogurt se OGGI è dopo la data di acquisto + giorni prima di scadenza
        //qui aggiungerei i giorni alla data e vedere se viene prima di oggi
        l.add(new Yogurt("Danino","Pesca","2026-04-08",10));
        l.add(new Yogurt("Yuomo","Fragola","2026-04-04",3));
        l.add(new Yogurt("Faggio","Vaniglia","2026-04-08",2));
        l.add(new Yogurt("Muppet","Pomodoro","2026-04-04",20));

        List<Expirable> nonScaduti = controlla(l);

        //generate toString in entrambe le classi

        //se è andato tutto bene dovrebbe stamparvi le patenti di Pippo e Gianni
        //e gli yogur danino ,faggio e muppet
        for(Expirable e : nonScaduti)
            System.out.println(e);
    }


    //questo metodo deve produrre una lista con dentro solo oggetti validi (non scaduti)
    private static List<Expirable> controlla(List<Expirable> l)
    {
    }
}
