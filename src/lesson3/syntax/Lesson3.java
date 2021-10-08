package lesson3.syntax;

import lesson1.helloWorldLibrary.WorldLibrary;



public class Lesson3 {
    final String SOME_CONSTANT = "constant";
//    SOME_CONSTANT = "cannot override it";
    final float PI = 3.14f;

    public static void main(String[] args) {

        RocketShip ship = new RocketShip();
        ship.fly(10);

        Bird bird = new Bird();
        bird.fly(1);

        Penguin penguin = new Penguin();
        penguin.fly(10);

        if( penguin instanceof Penguin) {
            System.out.println("Penguin is a Penguin");
        }
        if( penguin instanceof Bird ) {
            System.out.println("Penguin is a Bird");
        }
//        if( penguin instanceof RocketShip ) {
//            System.out.println("Penguin cannot be a rocketship");
//        }

        int result = 2;
        result += 5;

        System.out.println("Result = " + result);


//        I want to print my name here, using Static s class
        Statics statics = new Statics("not Artjoms");

        System.out.println("name:" + statics.getName());

        System.out.println("Surname: " + Statics.getSurname());

    }

    public static String boop() {
        return WorldLibrary.getName();
    }
}

enum RocketTypes {
    BEZOS,
    MUSK,
    BRANSON
}

interface CanFlyInterface {
    boolean fly(int speed);
}

class RocketShip implements CanFlyInterface {

    @Override
    public boolean fly(int speed) {
        System.out.println("Whoosh, I am flying!");
        return true;
    }
}

class Bird implements CanFlyInterface {

    @Override
    public boolean fly(int speed) {
        System.out.println("Chirp. chirp!");
        return true;
    }
}

class Penguin extends Bird {
    public boolean walk(int speed){
        System.out.println("Quack, Quack!");
        return true;
    }
}
