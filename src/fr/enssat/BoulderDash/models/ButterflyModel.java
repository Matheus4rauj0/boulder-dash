package fr.enssat.BoulderDash.models;

public class ButterflyModel extends MovableElementModel {
    private static String pathToSprite = "insert/path/down/here";
    private static int priority = 2;

    public ButterflyModel(int x, int y) {
        super(pathToSprite, priority, x, y);
    }
}
