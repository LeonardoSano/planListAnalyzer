package com.example.demo.supremaziatotale;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.util.List;

@RestController
public class Controller implements WebMvcConfigurer {
    @RequestMapping("/")
    public List<PlanList> home() throws IOException, JSONException {
        Service tutto = new Service();
        tutto.crea();
        return tutto.esegui();
    }


}
