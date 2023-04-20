package org.yup.oregontrail;

public class OregonTrailApp {

    public static void main(String[] args) {

        Traveller marivn = new Traveller("Marivn",100,100);

        System.out.println("before hunting food: " + marivn.getFood());

        System.out.println(marivn.hunt());

        System.out.println("after hunting food: " + marivn.getFood());

        System.out.println(marivn.eat());

        System.out.println(marivn.eat());

        System.out.println(marivn.eat());

        System.out.println(marivn.eat());

        System.out.println(marivn.eat());

        System.out.println(marivn.eat());

        System.out.println("After eating marvin has: " + marivn.getFood() + " food left.");


    }

}
