package monprojet.dao;

import java.util.List;

import monprojet.DTO.populationPays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import monprojet.entity.City;
import monprojet.entity.Country;

// This will be AUTO IMPLEMENTED by Spring 

public interface CountryRepository extends JpaRepository<Country, Integer> {
    /**
     * Calculer la population totale d'un pays
     * @param countryID la clé du pays
     * @return la somme des populations des villes du pays
     */
    @Query("SELECT SUM(c.population) FROM City c WHERE c.country.id = :countryID")
    Integer populationTotale(Integer countryID);

    /**
     * Calcule la populati
     * @param
     * @return la liste des pays et leur population
     */
    @Query("SELECT c.country.name as nom, SUM(c.population) AS population"
            + "FROM City c "
            + "GROUP BY nom ")
    List<populationPays> populationParPays();


}
