package facade;
//facade ascunderea complexitatii arborelui de clase si functionalitati
//si punem la dispozitie metode care in spate interactioneaza cu logica mai complexa
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
