package main;

import auxiliaries.WrongArgumentException;
import creatures.Creature;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Battle battle = new Battle();
        battle.makeCreatures(3);

        Listener listener = new Listener();
        listener.start();
        while (true)
            listener.listen();

    }
}