import models.Manufacturer;
import models.Souvenir;
import services.*;
import DAO.*;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SouvenirDAO souvenirDAO = new SouvenirDAO();
        SouvenirService souvenirService = new SouvenirService(souvenirDAO);

        ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
        ManufacturerService manufacturerService = new ManufacturerService(manufacturerDAO);

        Manufacturer mainManufacture
                = new Manufacturer("Zara", "Poland");
        Souvenir souvenir
                = new Souvenir("Golden ring","made in Poland", LocalDate.now(),300,mainManufacture);
        manufacturerService.save(mainManufacture);
        souvenirService.save(souvenir);
    }
}
