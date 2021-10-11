package hw1;

public class Main {

    public static void main(String[] args) {
        Power[] runAndJump = {new Robot("153",125,2), new Cat("Murzik",20,5),new Human("Ivan",25,2),new Cat("Muska",31,8)};
        Obstacle[] obstacles = {new Wall(1), new Treadmill(10),new Treadmill(18),new Wall(2),new Treadmill(30), new Treadmill(31)};

        for(Power obj:runAndJump){
            for(Obstacle x:obstacles){
                if(x instanceof Wall){
                    int h1 = ((Wall) x).getH();
                    Jumpable j= (Jumpable) obj;
                    if(j.jump(h1)) break;
                }
                else {
                    int w1 = ((Treadmill) x).getW();
                    Runable r = (Runable) obj;
                    if (r.run(w1)) break;
                }
            }

        }


    }
}
