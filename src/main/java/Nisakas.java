
/**
 * Nisakas-luokka, jonka tarkoitus on luoda uusia nisäkkäitä
 * @author ylhaart
 */
public class Nisakas {

    private String laji;
    private String kutsumanimi;
    private int ika;
    private String silmienVari;

    /**
     * tapaus 1: konstruktori, joka luo uusia Valle-jääkarhuja:
     */
    public Nisakas() {
        this.laji = "jääkarhu";
        this.kutsumanimi = "Valle";
        this.ika = 5;
        this.silmienVari = "musta";
    }

    /**
     * tapaus 2: konstruktori, joka luo uusia 0-vuotiaita nisäkkaita:
     *
     * @param laji
     * @param kutsumanimi
     * @param silmienVari
     */
    public Nisakas(String laji, String kutsumanimi, String silmienVari) {
        this.laji = laji;
        this.kutsumanimi = kutsumanimi;
        this.silmienVari = silmienVari;
    }

    /**
     * tapaus 3: konstruktori, joka luo uusia ihmisiä
     *
     * @param kutsumanimi
     * @param ika
     * @param silmienVari
     */
    public Nisakas(String kutsumanimi, int ika, String silmienVari) {
        this.laji = "ihminen";
        this.kutsumanimi = kutsumanimi;
        this.ika = ika;
        this.silmienVari = silmienVari;
    }

    /**
     * tapaus 4: konstruktori, joka luo uusia nisäkkäitä (tässä käyttäjä pystyy
     * määrittelemään kaikki nisäkkään tiedot)
     *
     * @param laji
     * @param kutsumanimi
     * @param ika
     * @param silmienVari
     */
    public Nisakas(String laji, String kutsumanimi, int ika, String silmienVari) {
        this.laji = laji;
        this.kutsumanimi = kutsumanimi;
        this.ika = ika;
        this.silmienVari = silmienVari;
    }

    // toString-metodi avuksi nisäkäs-olion tietojen tulostamiseen pääohjelmassa:
    @Override
    public String toString() {
        return "Hei, olen " + this.kutsumanimi + "-niminen " + this.laji + ". Olen "
                + this.ika + "-vuotias ja silmieni väri on " + this.silmienVari + ".";
    }
}
