package com.example;

public class Tetris {

    private Field field;
    private Figure figure;
    static Tetris game;

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    public void run() {

    }

    public void step() {

    }

    public static void main(String[] args) {
	// write your code here
        game = new Tetris();
        game.run();
        System.out.println("Hello Jojo");
    }
}
