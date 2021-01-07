package com.github.vsturaro.cites.api;

import com.github.vsturaro.cites.api.countries.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResourse {

    @GetMapping
    public List<Country> countries(){
        return
    }
}
