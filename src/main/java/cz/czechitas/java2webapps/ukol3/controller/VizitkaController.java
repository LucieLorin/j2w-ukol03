package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */

@Controller
public class VizitkaController {
    private final List<Vizitka> vizitkaList;

    public VizitkaController() {
        vizitkaList = Arrays.asList(

                new Vizitka("Lucie Bazantova", "Allianz", "Pod Vrchem 2792", "Melnik 27601", "luciebaz@email.cz", "603798693", null),
                new Vizitka("Irena Bazantova", "MKZ Litomerice", "Prazska 88", "Litomerice 41201", "fakeEmail@email.cz", "111222333", "www.mkz-ltm.cz"),
                new Vizitka("Pepa Bazant", "Armada CR", "Jarosova 22", "Litomerice 41201", null, "222333444", "www.acr.cz"),
                new Vizitka("Fanda Bazant", "SPSS Roosveltova", "Prazska 88", "Litomerice 41201", "fejkEmail@email.cz", null, "www.spss.cz")
        );
    }
    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("vizitkaList", vizitkaList);
        return modelAndView;
    }

    @GetMapping("/detail")
    public ModelAndView detail(int id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("vizitka", vizitkaList.get(id));
        return modelAndView;
    }
}