package com.company;

interface Tvremote{
    void onTv();
    void offTv();
}

interface SmartTvRemote extends Tvremote{
    void changeChannel();
    void volumeUp();
    void mute();
}

class Tv implements SmartTvRemote{
    public void changeChannel(){
        System.out.println("Changing channel....");
    }
    public void volumeUp(){
        System.out.println("Volume increased...");
    }
    public void mute(){
        System.out.println("Muted....");
    }

    @Override
    public void onTv() {
        System.out.println("Tv on");
    }

    @Override
    public void offTv() {
        System.out.println("Tv off");
    }
}

public class PracticeInterfaces   {
    public static void main(String[] args) {
        Tv samsung = new Tv();
        samsung.onTv();
        samsung.changeChannel();
        samsung.volumeUp();
        samsung.mute();
        samsung.offTv();
    }
}
