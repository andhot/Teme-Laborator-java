package Problema3;

public class Placa {
    /*
    descriere (String cu valori precum usa, capac, laterală, raft mobil, raft fix, etc)
    o lungime în milimetri (întreg)
    o laţime în milimetri (întreg)
    o orientare– enumerare cu valorile posibile LUNGIME, LATIME, ORICARE
    o canturi (vector de 4 elemente boolean). Fiecare piesă de pal care face parte dintr-un
    corp de mobilă, are 4 muchii. O anumită valoare booleană indică prezența sau
    absența cantului pe muchia corespunzătoare.
            o nr_bucati (int)
     */
    private String descriere;
    private int lungime;
    private int latime;
    private Orientare orientare;
    private boolean[] canturi = new boolean[4];

    private int nr_bucati;

    public Placa()
    {

    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public Orientare getOrientare() {
        return orientare;
    }

    public void setOrientare(Orientare orientare) {
        this.orientare = orientare;
    }

    public boolean[] getCanturi() {
        return canturi;
    }

    public void setCanturi(boolean[] canturi) {
        this.canturi = canturi;
    }

    public int getNr_bucati() {
        return nr_bucati;
    }

    public void setNr_bucati(int nr_bucati) {
        this.nr_bucati = nr_bucati;
    }

    public Placa(String descriere, int lungime, int latime, Orientare orientare, boolean[] canturi, int nr_bucati) {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.orientare = orientare;
        this.canturi = canturi;
        this.nr_bucati = nr_bucati;
    }

    @Override
    public String toString() {
        return "\nDescriere: "+descriere+"\nLungime: "+lungime+"\nLatime: "+latime+"\nOrientare: "+orientare+"\nCanturi: "+canturi[0]+", "+canturi[1]+", "+canturi[2]+", "+canturi[3]+"\nNumar de bucati: "+nr_bucati+"\n";
    }
}