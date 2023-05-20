package Facade.automobil;

public class DealerAuto {
    private MasinaSport masinaSport;
    private MasinaElectrica masinaElectrica;
    private MasinaFamilie masinaFamilie;
    public DealerAuto(){
        this.masinaElectrica = new MasinaElectrica("masina electrica");
        this.masinaFamilie = new MasinaFamilie("masina familie");
        this.masinaSport = new MasinaSport("masina sport");
    }
    public void descrieMasinaElectrica(){
        this.masinaElectrica.descrie();
    }
    public void descrieMasinaSport(){
        this.masinaSport.descrie();
    }
    public void descrieMasinaFamilie(){
        this.masinaFamilie.descrie();
    }
}
