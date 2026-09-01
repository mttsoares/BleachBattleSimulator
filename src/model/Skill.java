package model;

public abstract class Skill {
    private Double cost;
    private Double damage;
    private Integer cooldown;

    public Skill(Double cost, Double damage, Integer cooldown) {
        this.cost = cost;
        this.damage = damage;
        this.cooldown = cooldown;
    }

    public Double getCost() {return cost;}
    public void setCost(Double cost) {this.cost = cost;}
    public Double getDamage() {return damage;}
    public void setDamage(Double damage) {this.damage = damage;}
    public Integer getCooldown() {return cooldown;}
    public void setCooldown(Integer cooldown) {this.cooldown = cooldown;}
}
