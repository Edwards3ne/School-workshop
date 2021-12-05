package com.greenfoxacademy.music;

public class Violin extends StringedInstrument {
    public Violin() {
        numberOfStrings=4;
    }

    public Violin(int numberOfStrings) {
        this.numberOfStrings=numberOfStrings;
    }

    @Override
    public String sound() {
        return "Screech";
    }

    @Override
    public void play() {
        System.out.println("Violin, a "+numberOfStrings+"-stringed instrument that goes "+sound());
    }
}
