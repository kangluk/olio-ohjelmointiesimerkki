
/**
 *
 * @author ylhaart
 */
public class Main {

    public static void main(String[] args) {
        Nisakas n1 = new Nisakas("Liisa", 18, "sininen"); // oletuslaji: ihminen
        Nisakas n2 = new Nisakas("Kalle", 20, "ruskea"); // oletuslaji: ihminen
        Nisakas n3 = new Nisakas("apina", "Abu", 2, "tummanruskea");
        Nisakas n4 = new Nisakas(); // oletustiedoilla luotu Valle-jääkarhu 
        Nisakas n5 = new Nisakas("koira", "Turre", "vihreä"); // 0-vuotias Turre-koira

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

        /* Ylläolevista tulostuskomennoista tulostuu:
        Hei, olen Liisa-niminen ihminen. Olen 18-vuotias ja silmieni väri on sininen.
        Hei, olen Kalle-niminen ihminen. Olen 20-vuotias ja silmieni väri on ruskea.
        Hei, olen Abu-niminen apina. Olen 2-vuotias ja silmieni väri on tummanruskea.
        Hei, olen Valle-niminen jääkarhu. Olen 5-vuotias ja silmieni väri on musta.
        Hei, olen Turre-niminen koira. Olen 0-vuotias ja silmieni väri on vihreä.
         */
    }

}
