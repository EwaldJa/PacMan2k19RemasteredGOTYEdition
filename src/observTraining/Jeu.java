package observTraining;

import java.util.Observable;

public class Jeu extends Observable implements Runnable {

    public static final int COL = 10, LIG = 10;

    private boolean[][] state;

    public Jeu() {
        this.addObserver(new Console(this));
        state = new boolean[COL][LIG];
    }

    public void run() {
        while (true) {
            this.setChanged();
            this.notifyObservers();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Jeu mygame = new Jeu();
        new Thread(mygame).start();
    }

    public boolean[][] getState() {
        return state;
    }
}
