package hw1;

public class Wall extends Obstacle {
    private int h;
    public Wall(int h){
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
