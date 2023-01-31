package monprojet.DTO;

import monprojet.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface populationPays{
    String getNom();
    Long getPopulation();
}
