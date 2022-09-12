public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear bhalu = new Bear();
        bhalu.eatsMeat();
        bhalu.eatsGrass();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}

// Multiple Inheritance
interface Carnivore {
    void eatsMeat();
}

interface Herbivore {
    void eatsGrass();
}

class Bear implements Carnivore, Herbivore {
    public void eatsMeat() {
        System.out.println("Bear eats Meat");
    }

    public void eatsGrass() {
        System.out.println("Bear eats Grass");
    }
}