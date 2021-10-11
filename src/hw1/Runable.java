package hw1;

public interface Runable extends Power {
 default boolean run(int w){
  System.out.println(" пробежал на " + w);
  return false;
 }

}
