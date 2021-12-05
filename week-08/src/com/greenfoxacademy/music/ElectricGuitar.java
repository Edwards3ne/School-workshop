package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        numberOfStrings=6;
    }

    public ElectricGuitar(int numberOfStrings) {
       this.numberOfStrings=numberOfStrings;
    }


    @Override
    public String sound() {
        return "Twang";
    }

    @Override
    public void play() {
        System.out.println("Electric Guitar, a "+numberOfStrings+"-stringed instrument that goes "+sound());
    }
}
