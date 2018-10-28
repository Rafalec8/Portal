public class Portal {
    int[] polaPolozenia;
    int iloscTrafien;

    Portal() {
    }

    public void setPolaPolozenia(int[] ppol) {
        this.polaPolozenia = ppol;
    }

    public String sprawdz(String stringPole) {
        int strzal = Integer.parseInt(stringPole);
        String wynik = "pudło";
        int[] var4 = this.polaPolozenia;
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int pole = var4[var6];
            if (strzal == pole) {
                wynik = "trafiony";
                ++this.iloscTrafien;
                break;
            }
        }

        if (this.iloscTrafien == this.polaPolozenia.length) {
            wynik = "zatopiony";
        }

        System.out.println(wynik);
        return wynik;
    }
}