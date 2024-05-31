package herds;

import java.util.ArrayList;

public class Herd implements Movable {
    ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable movable: herd) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable movable: herd) {
            result.append(movable).append("\n");
        }

        return result.toString();
    }
}
