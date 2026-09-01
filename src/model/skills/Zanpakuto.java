package model.skills;

import model.Skill;

public class Zanpakuto extends Skill {
    private String name;
    public Zanpakuto(String name, Double cost, Double damage, Integer cooldown) {
        super(cost, damage, cooldown);
        this.name = name;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public void shikai(){
        setDamage(getDamage() * 1.2);
        setCost(200.0);
    }
    public void bankai(){
        setDamage(getDamage() * 2.5);
        setCost(1000.0);
    }

}
