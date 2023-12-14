package services;

import DAO.ManufacturerDAO;
import models.Manufacturer;

import java.util.List;

public class ManufacturerService {
    private ManufacturerDAO manufacturerDAO;

    public ManufacturerService(ManufacturerDAO manufacturerDAO) {
        this.manufacturerDAO = manufacturerDAO;
    }

    public void save(Manufacturer manufacturer) {
        manufacturerDAO.save(manufacturer);
    }

    public void update(Manufacturer manufacturer) {
        manufacturerDAO.update(manufacturer);
    }

    public void delete(Manufacturer manufacturer) {
        manufacturerDAO.delete(manufacturer);
    }

    public Manufacturer get(Long id) {
        return manufacturerDAO.get(id);
    }
    public List<Manufacturer> getAll(){return  manufacturerDAO.getAll();}
}
