package superhero;

import java.util.ArrayList;
import java.util.List;

public class SuperHero {
    private static final int LIFE_POINTS_TAKEN_ON_ATTACK = 10;
    private static final int MIN_NAME_LENGTH = 3;
    private static final int MAX_NAME_LENGTH = 60;
    private static final int MIN_IDENTITY_LENGTH = 3;
    private static final int MAX_IDENTITY_LENGTH = 60;
    private List<Power> powers;
    private String name;
    private String identity;
    private Alligment allignment;
    private int lifePoints;
    private List<PowerType> immunities;

    public SuperHero(List<PowerType> immunities, String name, String identity, Alligment allignment, int lifePoints) {
        setName(name);
        this.name = name;
        setIdentity(identity);
        setAllignment(allignment);
        setLifePoints(lifePoints);
        setPowers(new ArrayList<>());
        setImmunities(immunities);
    }


    public void setPowers(List<Power> powers) {
        this.powers = powers;
    }

    public void setName(String name) {
        if (name == null) {
            return;
        }
        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            return;
        }
        this.name = name;
    }

    public void setIdentity(String identity) {
        if (identity == null) {
            return;
        }
        if (identity.length() < MIN_IDENTITY_LENGTH || identity.length() > MAX_IDENTITY_LENGTH) {
            return;
        }
        this.identity = identity;
    }

    public void setAllignment(Alligment allignment) {
        this.allignment = allignment;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setImmunities(List<PowerType> immunities) {
        this.immunities = immunities;
    }


    public List<Power> getPowers() {
        return powers;
    }

    public String getName() {
        return name;
    }

    public String getIdentity() {
        return identity;
    }

    public Alligment getAllignment() {
        return allignment;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public List<PowerType> getImmunities() {
        return immunities;
    }


    public SuperHero(String name, String identity, Alligment allignment, int lifePoints) {
        this(new ArrayList(), name, identity, allignment, lifePoints);

    }


    void attack(SuperHero attackedSuperhero, Power power) {
        boolean isAttackedSuperheroImmune = attackedSuperhero.getImmunities().contains(power.getPowerType());
        int currentLifePoints = attackedSuperhero.getLifePoints();
        if (isAttackedSuperheroImmune) {
            attackedSuperhero.setLifePoints(currentLifePoints);
        } else {

            attackedSuperhero.setLifePoints(currentLifePoints - LIFE_POINTS_TAKEN_ON_ATTACK);
        }

    }

    public void addImmunity(PowerType tech) {
        immunities.add(tech);
    }

    public void addPower(Power power) {
        powers.add(power);
    }
}

