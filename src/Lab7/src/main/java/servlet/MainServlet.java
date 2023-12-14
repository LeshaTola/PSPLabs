package servlet;

import DAO.ManufacturerDAO;
import DAO.SouvenirDAO;
import models.Manufacturer;
import models.Souvenir;
import services.ManufacturerService;
import services.SouvenirService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/")
public class MainServlet extends HttpServlet {
    private SouvenirService souvenirService;
    private ManufacturerService manufacturerService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SouvenirDAO souvenirDAO = new SouvenirDAO();
        souvenirService = new SouvenirService(souvenirDAO);

        ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
        manufacturerService = new ManufacturerService(manufacturerDAO);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/main.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String act = request.getParameter("action");
        String manufName;
        List<Souvenir> souvenirList;
        List<Manufacturer> manufacturerList;

        switch (act) {
            case "findSouvenirByManuf":
                request.setAttribute("Action","main?action=submitFindSouvenirByManuf");
                request.getRequestDispatcher("views/getManufacture.jsp").forward(request, response);
                break;
            case "submitFindSouvenirByManuf":
                manufName = request.getParameter("name");
                souvenirList = souvenirService.getAll();
                var newList = new ArrayList<Souvenir>();
                for (var souvenir : souvenirList) {
                    if (souvenir.getManufacturer().getName().equals(manufName)){
                        newList.add(souvenir);
                    }
                }
                request.setAttribute("souvenirList", newList);
                request.getRequestDispatcher("views/souvenirView.jsp").forward(request, response);
                break;
            case "findSouvenirByCountry":
                request.setAttribute("Action","main?action=submitFindSouvenirByCountry");
                request.getRequestDispatcher("views/getCountry.jsp").forward(request, response);
                break;
            case "submitFindSouvenirByCountry":
                var country = request.getParameter("country");
                souvenirList = souvenirService.getAll();
                var newSouvenirList = new ArrayList<Souvenir>();
                for (var souvenir : souvenirList) {
                    if (souvenir.getManufacturer().getCountry().equals(country)){
                        newSouvenirList.add(souvenir);
                    }
                }
                request.setAttribute("souvenirList", newSouvenirList);
                request.getRequestDispatcher("views/souvenirView.jsp").forward(request, response);
                break;

            case "findSouvenirByPrice":
                request.setAttribute("Action","main?action=submitFindSouvenirByPrice");
                request.getRequestDispatcher("views/getPrice.jsp").forward(request, response);
                break;
            case "submitFindSouvenirByPrice":
                var price = Integer.parseInt( request.getParameter("price"));
                souvenirList = souvenirService.getAll();
                var newSouvenirList2 = new ArrayList<Souvenir>();
                for (var souvenir : souvenirList) {
                    if (souvenir.getPrice() <price){
                        newSouvenirList2.add(souvenir);
                    }
                }
                request.setAttribute("souvenirList", newSouvenirList2);
                request.getRequestDispatcher("views/souvenirView.jsp").forward(request, response);
                break;
            case "findManufBySouvenirAndDate":
                request.setAttribute("Action","main?action=submitFindManufBySouvenirAndDate");
                request.getRequestDispatcher("views/getSouvenirAndDate.jsp").forward(request, response);
                break;
            case "submitFindManufBySouvenirAndDate":
                var souvenirName =  request.getParameter("name");
                var releaseDate = LocalDate.parse( request.getParameter("releaseDate"));
                souvenirList = souvenirService.getAll();
                var newManufList = new ArrayList<Manufacturer>();
                for (var souvenir : souvenirList) {
                    if (souvenir.getName().equals(souvenirName) && souvenir.getReleaseDate().equals(releaseDate)){
                        newManufList.add(souvenir.getManufacturer());
                    }
                }
                request.setAttribute("manufacturerList", newManufList);
                request.getRequestDispatcher("views/manufacturerView.jsp").forward(request, response);
                break;

            case "delete":
                request.setAttribute("Action","main?action=submitDelete");
                request.getRequestDispatcher("views/getManufacture.jsp").forward(request, response);
                break;
            case "submitDelete":
                manufName = request.getParameter("name");
                var list = manufacturerService.getAll();
                boolean deleted = false;
                for (var manuf : list) {
                    if (manuf.getName().equals(manufName)){
                        manufacturerService.delete(manuf);
                        deleted = true;
                        break;
                    }
                }

                request.setAttribute("deleted", deleted);
                request.getRequestDispatcher("views/submitDelete.jsp").forward(request, response);
                break;
        }
    }
}
