import java.util.*;

class Triangle { // Le fichier s'appelle Triangle.java
    public int xA, yA, xB, yB, xC, yC;

    public void creer() {
        Scanner lectureClavier = new Scanner(System.in);

        System.out.print("Point A : ");
        System.out.print("Entrer l'abscisse : ");
        xA = lectureClavier.nextInt();
        System.out.print("Entrer l'ordonnée : ");
        yA = lectureClavier.nextInt();

        System.out.print("Point B : ");
        System.out.print("Entrer l'abscisse : ");
        xB = lectureClavier.nextInt();
        System.out.print("Entrer l'ordonnée : ");
        yB = lectureClavier.nextInt();

        System.out.print("Point C : ");
        System.out.print("Entrer l'abscisse : ");
        xC = lectureClavier.nextInt();
        System.out.print("Entrer l'ordonnée : ");
        yC = lectureClavier.nextInt();
    }

    public void afficher() {
        System.out.println("Point A : " + xA + ", " + yA);
        System.out.println("Point B : " + xB + ", " + yB);
        System.out.println("Point C : " + xC + ", " + yC);
    }

    public void deplacer(int dx, int dy) {
        xA += dx; yA += dy;
        xB += dx; yB += dy;
        xC += dx; yC += dy;
    }
}

public class FaireDesTriangles {
    public static void main(String[] args) {
        Triangle T = new Triangle();

        T.afficher();
        T.creer();
        T.afficher();
        T.deplacer(100, 0);
        T.afficher();
    }
}
