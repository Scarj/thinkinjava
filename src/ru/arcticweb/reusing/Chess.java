package ru.arcticweb.reusing;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 09.05.14.
 */

class Game {
    Game(int i) {
        print("Конструктор Game()");
    }
}

class BoardGame extends Game{
    BoardGame(int i) {
        super(i);
        print("Конструкто BoardGame()");
    }
}

public class Chess extends BoardGame {
    public Chess() {
        super(11);
        print("Конструкто Chess()");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
