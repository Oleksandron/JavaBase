package Lesson4_2;

public class Player implements Playable,Recordable{
    @Override
    public void play() {
        System.out.println("Enter play");
    }

    @Override
    public void pause() {
        System.out.println("Enter pause");
    }

    @Override
    public void stop() {
        System.out.println("Enter stop");
    }

    @Override
    public void record() {
        System.out.println("Enter record");
    }
    public void erase(){
        System.out.println("Erase music");
    }

    public static void main(String[] args) {
        Player sony = new Player();
        sony.play();
        sony.pause();
        sony.stop();
        sony.erase();
        sony.record();
    }
}
