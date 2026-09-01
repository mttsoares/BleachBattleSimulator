package model.skills.kidos;

import model.Skill;

//Magias de restrição - Barreira e pa
public class Bakudo extends Skill {
    private Integer bakudoNumber;


    public Bakudo(Integer bakudoNumber, Double cost, Double damage, Integer cooldown) {
        super(cost, damage, cooldown);
        this.bakudoNumber = bakudoNumber;
    }

    public Integer getBakudoNumber() {return bakudoNumber;}
    public void setBakudoNumber(Integer bakudoNumber) {this.bakudoNumber = bakudoNumber;}

}
