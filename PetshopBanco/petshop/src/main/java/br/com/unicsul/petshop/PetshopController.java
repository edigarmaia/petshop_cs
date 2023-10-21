package br.com.unicsul.petshop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@SpringBootApplication
public class PetshopController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/servicos")
    public String rotaServicos() {
        return "servicos";
    }

    @GetMapping("/quemsomos")
    public String rotaQuemSomos(){
        return "quemsomos";
    }

    @GetMapping("/saudacao/{animal}")
    public String rotaSaudacao(@PathVariable String animal, ModelMap model) {
        model.addAttribute("animal", animal);
        return "saudacao";
    }
}
