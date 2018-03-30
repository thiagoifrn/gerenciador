package br.com.gerenciador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author CrunchDroid
 */
@Controller
public class PageController {

    @GetMapping("/")
    public String plainPage() {
        return "index";
    }

    @GetMapping("/pricing-tables")
    public String pricingTables() {
        return "pricing-tables";
    }

}
