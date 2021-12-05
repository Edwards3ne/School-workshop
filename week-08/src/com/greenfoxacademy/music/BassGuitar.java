package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar(int numberOfStrings) {
        this.numberOfStrings=numberOfStrings;
    }
    public BassGuitar() {
        numberOfStrings=4;
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

    @Override
    public void play() {
        System.out.println("Bass Guitar, a "+numberOfStrings+"-stringed instrument that goes "+sound());
    }
}
