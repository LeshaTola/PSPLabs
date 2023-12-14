package models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "souvenir")
public class Souvenir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String manufacturerDetails;
    private LocalDate releaseDate;
    private float price;

    @ManyToOne()
    @JoinColumn(name = "manufacturerId")
    private Manufacturer manufacturer;

    public Souvenir() {}

    public Souvenir(String name, String manufacturerDetails, LocalDate releaseDate, float price, Manufacturer manufacturer) {
        this.name = name;
        this.manufacturerDetails = manufacturerDetails;
        this.releaseDate = releaseDate;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturerDetails() {
        return manufacturerDetails;
    }

    public void setManufacturerDetails(String manufacturerDetails) {
        this.manufacturerDetails = manufacturerDetails;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    // getters and setters
}
