package gradlebootdata.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gradlebootdata.model.Country;
import gradlebootdata.service.ICountryService;

@Controller
public class MyController {

	@Autowired
	ICountryService countryService;

	@RequestMapping("/showCountries")
	public ModelAndView findCities() {

		List<Country> countries = (List<Country>) countryService.findAll();

		Map params = new HashMap<String, Object>();
		params.put("countries", countries);

		return new ModelAndView("showCountries", params);
	}
}