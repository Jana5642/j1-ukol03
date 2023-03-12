package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac janyPocitac = new Pocitac();
        janyPocitac.setCpu();
        janyPocitac.setRam();
        janyPocitac.setPevnyDisk();


        Disk janyDisk = new Disk();
        janyDisk.setKapacita(230_195_726_150L);
        janyDisk.setVyuziteMisto(180_195_726_150L);

        Pamet janyPamet = new Pamet();
        janyPamet.setKapacita(8_000_000_000L);

        Procesor janyProcesor = new Procesor();
        janyProcesor.setVyrobce("Intel Core");
        janyProcesor.setRychlost(1_600_000_000_000L);


        janyPocitac.setCpu(janyProcesor);
        janyPocitac.setRam(janyPamet);
        janyPocitac.setPevnyDisk(janyDisk);

        System.out.println(janyPocitac.toString());

        janyPocitac.zapniSe();
        janyPocitac.vypniSe();


















    }

}
