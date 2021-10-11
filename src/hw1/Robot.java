package hw1;

public class Robot implements Runable,Jumpable{
    private String name;
    private int h;
    private int w;
    public Robot(String name,int w,int h){
        this.name=name;
        this.w= w;
        this.h=h;
    }
    @Override
    public boolean jump(int h) {
        System.out.print("Робот "+ name);
        if (h<= this.h){
            Jumpable.super.jump(h);
        }
        else
            System.out.println(" не смог прыгнуть на высоту " +h);
        return (h>this.h);
    }

    @Override
    public boolean run(int w) {
        System.out.print("Робот "+ name);
        if (w<= this.w)
            Runable.super.run(w);
        else
            System.out.println(" не смог пробежать на расстояние " + w);
        return (w>this.w);
    }

}
