package lv.artjoms.rocketscience;

public class LaunchPad {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();
        rocket1 = null;
        System.out.println("There are so many rockets: " + rocket1.countRockets());

    }
}
