package gradlebootdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gradlebootdata.model.Country;
import gradlebootdata.repository.CountryRepository;

@Service
public class CountryService implements ICountryService {

	@Autowired
	private CountryRepository repository;

	@Override
	public List<Country> findAll() {
		List<Country> countries = (List<Country>) repository.findAll();
		
		return countries;
	}
}
