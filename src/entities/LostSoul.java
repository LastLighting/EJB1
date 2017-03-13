package entities;

import java.io.Serializable;
import java.sql.Date;

public class LostSoul implements Serializable {

    private Integer idSoul;
    private String name;
    private String couseOfDeath;
    private Date dateOfDeath;
    private int lifeIvents;
    private int age;

    public Integer getIdSoul() {
        return idSoul;
    }

    public void setIdSoul(Integer idSoul) {
        this.idSoul = idSoul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCouseOfDeath() {
        return couseOfDeath;
    }

    public void setCouseOfDeath(String couseOfDeath) {
        this.couseOfDeath = couseOfDeath;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public int getLifeIvents() {
        return lifeIvents;
    }

    public void setLifeIvents(int lifeIvents) {
        this.lifeIvents = lifeIvents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
