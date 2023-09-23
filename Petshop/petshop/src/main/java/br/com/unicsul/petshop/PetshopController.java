package br.com.unicsul.petshop;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PetshopController {

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
