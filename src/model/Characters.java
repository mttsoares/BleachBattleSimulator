package model;

import model.charactersClass.Classes;

import java.util.ArrayList;
import java.util.List;

public class Characters {
    private String name;
    private Double life;
    private Double reiatsu;
    private Classes characterClass;
    private List<Skill> skills = new ArrayList<>();

    public Characters(){}
    public Characters(String name, Double life, Double reiatsu, Classes characterClass) {
        this.name = name;
        this.life = life;
        this.reiatsu = reiatsu;
        this.characterClass = characterClass;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Double getLife() {return life;}
    public void setLife(Double life) {this.life = life;}
    public Double getReiatsu() {return reiatsu;}
    public void setReiatsu(Double reiatsu) {this.reiatsu = reiatsu;}
    public Classes getCharacterClass() {return characterClass;}
    public void setCharacterClass(Classes characterClass) {this.characterClass = characterClass;}
    public List<Skill> getSkills(){return skills;}
    public void setSkills(List<Skill> skills){this.skills = skills;}
}
