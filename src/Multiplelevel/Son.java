package Multiplelevel;

public class Son extends Father{
    public int age = 20;

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.age);
        System.out.println(son.eyecolour);
        System.out.println(son.height);

    }
}
