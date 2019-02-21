package superhero;

import superhero.SuperHero;

public class DrivenClass {
    public static void main(String[] args) {
        SuperHero batman = new SuperHero("Batman", "Bruce Wayne", Alligment.GOOD, 100);

        Power power = new Power("Utility belt", PowerType.TECH);
        batman.addPower(power);
        SuperHero superman = new SuperHero("Superman", "Clark Kent", Alligment.GOOD,
                100);
        batman.attack(superman, power);
        System.out.println(superman.getLifePoints());
        superman.addImmunity(PowerType.TECH);
        batman.attack(superman, power);
        System.out.println(superman.getLifePoints());
    }
}
