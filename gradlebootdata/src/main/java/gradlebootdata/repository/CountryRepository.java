package gradlebootdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gradlebootdata.model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

}
