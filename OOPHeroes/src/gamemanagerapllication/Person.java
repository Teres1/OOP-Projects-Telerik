package gamemanagerapllication;

class Person {
    private String name;
    private double weight;
    private Gender gender;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person(String name, double weight, Gender gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }


}
