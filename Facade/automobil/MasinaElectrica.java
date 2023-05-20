package Facade.automobil;

public class MasinaElectrica extends Automobil{
    public MasinaElectrica(String desc){
        this.descriere = desc;
    }
    @Override
    public void descrie() {
        System.out.println(this.descriere);
    }
}
