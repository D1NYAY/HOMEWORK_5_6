package com.company;

public class Boss {
    Boss dragonBoss = new Boss();{
        dragonBoss.setBossHealth(300);
        dragonBoss.setBossDamage(20);
        dragonBoss.setBossDefenceType("laser shoot");
        System.out.println("Boss health: " + dragonBoss.getBossHealth());
        System.out.println("Boss damage: " + dragonBoss.getBossDamage());
        System.out.println("Boss damage" + dragonBoss.getBossDefenceType());
    }
    public void Main () {
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {

            System.out.println("Heroes :" + createHeroes()[i].getHeroDamage() + " " + createHeroes()[i].getHeroHealth() + " "
                    +  createHeroes()[i].getHeroesAttackType());

        }
    }

    public static Hero[] createHeroes(){
        Hero spiderMan = new Hero(200,25,"web shoot");
        Hero thor = new Hero(250,30,"hammer atack");
        Hero ironMan = new Hero(250,20,"laser shoot");
        Hero[] array = {spiderMan,thor,ironMan};
        return array;
    }
}