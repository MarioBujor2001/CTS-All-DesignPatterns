package Proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new FilteredInternet();
        //Acces permis
        internet.connect("http://www.example.com");
        //Acces blocat
        internet.connect("http://www.somesocialmedia.com");
    }
}
