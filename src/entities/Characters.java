package entities;

public class Characters {
    private String name;
    private Double life;
    private Double reiatsu;

    public Characters(){}
    public Characters(String name, Double life, Double reiatsu) {
        this.name = name;
        this.life = life;
        this.reiatsu = reiatsu;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getLife() {
        return life;
    }
    public void setLife(Double life) {
        this.life = life;
    }
    public Double getReiatsu() {
        return reiatsu;
    }
    public void setReiatsu(Double reiatsu) {
        this.reiatsu = reiatsu;
    }
}
