package com.example.example;

//abstract class
//Blueprint of remote
abstract class RemoteControl {
    //abstract method
    abstract  void changeChannel(int channel);

    //abstract method to increase the volume
    abstract void increaseVolume(int increment);
}

class SonyRemote extends RemoteControl{

    private int channel = 1;
    private int volume =10;

    @Override
    void changeChannel(int channel){
        this.channel = channel;
        System.out.println("Sony TV :Changed to chhanel " + this.channel);
    }


    @Override
    void increaseVolume(int increment){
        this.volume += increment;
        System.out.println("Sony TV: Volume increased to " + this.volume);
    }
}

class VideconRemote extends RemoteControl{
    private int channel = 1;
    private int volume =10;

    @Override
    void changeChannel(int channel){
        this.channel = channel;
        System.out.println("videocon TV :Changed to chhanel " + this.channel);
    }

    @Override
    void increaseVolume(int increment){
        this.volume += increment;
        System.out.println("Videocon TV: Volume increased to " + this.volume);
    }
}


//Sales person showing the remote
public class RemoteControlDemo{

    public static void main(String[] args){

        //create a Sony remote control object
        RemoteControl sonyRemote = new SonyRemote();
        sonyRemote.changeChannel(5);
        sonyRemote.increaseVolume(3);

        //create a Videocon remote control object
        RemoteControl videconRemote = new VideconRemote();
        videconRemote.changeChannel(10);
        videconRemote.increaseVolume(6);
    }
}