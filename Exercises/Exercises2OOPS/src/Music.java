public class Music implements Playable {
    @Override
    public void play(){
        System.out.println("Music");
    }

    public void display() {
        play();
    }

}
