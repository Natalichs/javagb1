package hw1;

public interface Jumpable extends  Power {
    default boolean jump(int h){
        System.out.println(" прыгнул на " + h);
        return  false;
    }
}
