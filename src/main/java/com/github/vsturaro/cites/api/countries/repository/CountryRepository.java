package com.github.vsturaro.cites.api.repository;

import com.github.vsturaro.cites.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
