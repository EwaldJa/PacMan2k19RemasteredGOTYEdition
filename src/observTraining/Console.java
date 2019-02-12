package observTraining;

import java.util.Observable;
import java.util.Observer;

public class Console implements Observer {

    private Jeu mygame;

    public Console(Jeu jeu) {
        mygame = jeu;
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        System.out.println("Grille actuelle : ");
        boolean[][] tab = mygame.getState();
        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
