package cz.czechitas.java2webapps.ukol3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  @GetMapping("/")
  public String seznam() {
    return "seznam";
  }

  @GetMapping("/detail")
  public String detail() {
    return "detail";
  }
}
