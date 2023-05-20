package facade.automobil;

public class MasinaFamilie extends Automobil{
    public MasinaFamilie(String desc){
        this.descriere = desc;
    }

    @Override
    public void descrie() {
        System.out.println(this.descriere);
    }
}
