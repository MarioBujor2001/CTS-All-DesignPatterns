package facade.automobil;

public class MasinaSport extends Automobil{
    public MasinaSport(String desc){
        this.descriere = desc;
    }
    @Override
    public void descrie() {
        System.out.println(this.descriere);
    }
}
