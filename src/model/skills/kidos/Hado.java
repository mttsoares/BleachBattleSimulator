package model.skills.kidos;

import model.Skill;

//Magias de ataque
public class Hado extends Skill {
    private Integer hadoNumber;

    public Hado(Integer hadoNumber, Double cost, Double damage, Integer cooldown) {
        super(cost, damage, cooldown);
        this.hadoNumber = hadoNumber;
    }

    public Integer getHadoNumber() {return hadoNumber;}
    public void setHadoNumber(Integer hadoNumber) {this.hadoNumber = hadoNumber;}
}
