package org.yup.oregontrail;

public class Traveller {

    private String name;
    private int health;
    private boolean isHealthy;
    private int food;

    public Traveller(String name, int health, int food) {
        this.name = name;
        this.health = health;
        this.food = food;
        this.isHealthy = true;

    }

    public String eat() {

        if(this.getFood() >= 20) {
            this.setFood(this.getFood() - 20);
            return "Good eats! Yum!";
        }else {
            this.setHealthy(false);
            this.setHealth(0);
            return "omg i need some foOooOod!";
        }
    }

    public String getName() {

        if(this.name.equals("HUbert")) {
            return "Punk";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {

        this.food = food;
    }

    public String hunt() {

        if (Math.random() > .5) {
            setFood(100);
            this.food+=100;

            return "The hunt was successful for " + getName() + " and their food is now at: " + getFood();
        }
        return "The hunt was a major failure for " + getName() + " and their food is still at: " + getFood();


    }


}
