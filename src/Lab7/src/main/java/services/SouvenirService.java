package services;

import DAO.SouvenirDAO;
import models.Souvenir;

import java.util.List;

public class SouvenirService {
    private SouvenirDAO souvenirDAO;

    public SouvenirService(SouvenirDAO souvenirDAO) {
        this.souvenirDAO = souvenirDAO;
    }

    public void save(Souvenir souvenir) {
        souvenirDAO.save(souvenir);
    }

    public void update(Souvenir souvenir) {
        souvenirDAO.update(souvenir);
    }

    public void delete(Souvenir souvenir) {
        souvenirDAO.delete(souvenir);
    }

    public Souvenir get(Long id) {
        return souvenirDAO.get(id);
    }
    public List<Souvenir> getAll(){return  souvenirDAO.getAll();}
}

