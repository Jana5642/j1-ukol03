package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;



    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac = " + " cpu = " + cpu + "/" + " ram = " + ram + "/" + " pevnyDisk = " + pevnyDisk;
    }

    public void isJeZapnuty() {
        if (!jeZapnuty){
            System.out.println("Počítač je zapnutý");
            return;
        }
        if (jeZapnuty){
            System.out.println("Počítač je vypnutý");
            return;
        }
        this.jeZapnuty = jeZapnuty;
    }



    public void vypniSe(){
        if (!jeZapnuty){
            System.out.println("Počítač je zapnutý");
        }else{
            System.out.println("Vypni počítač");
        }
    }
    public void zapniSe(){
        if (jeZapnuty){
            System.out.println("Počítač je vypnutý");
        }
        if (this.ram == null || this.cpu == null || this.pevnyDisk == null){
            System.out.println("Musí obsahovat všechny části");
        }else{
            System.out.println("Zapni počítač");
        }

    }



}
