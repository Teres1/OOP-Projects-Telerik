package gamemanagerapllication;

import java.util.List;

class Hero extends Person {
    private String secretIdentity;
    private String backStory;
    private boolean isGood;
    List<String> listOfPowers;

    public Hero() {

    }

    public Hero(String secretIdentity, String backStory, boolean isGood, List<String> listOfPowers) {
        this.secretIdentity = secretIdentity;
        this.backStory = backStory;
        this.isGood = isGood;
        this.listOfPowers = listOfPowers;
    }

    public Hero(String name, double weight, Gender gender, String secretIdentity, String backStory, boolean isGood, List<String> listOfPowers) {
        super(name, weight, gender);
        this.secretIdentity = secretIdentity;
        this.backStory = backStory;
        this.isGood = isGood;
        this.listOfPowers = listOfPowers;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public String getBackStory() {
        return backStory;
    }

    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public List<String> getListOfPowers() {
        return listOfPowers;
    }

    public void setListOfPowers(List<String> listOfPowers) {
        this.listOfPowers = listOfPowers;
    }
}
