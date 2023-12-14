package models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String country;

    @OneToMany(mappedBy = "manufacturer")
    private List<Souvenir> souvenirs;

    public Manufacturer() {}

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Souvenir> getSouvenirs() {
        return souvenirs;
    }

    public void setSouvenirs(List<Souvenir> souvenirs) {
        this.souvenirs = souvenirs;
    }
}