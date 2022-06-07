package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class ImpiantoElettricoServiceImpl implements ImpiantoElettricoService {

	@Override
	public void installaImpianto(Automobile automobileInput) {
		System.out.println("Impianto elettrico installato correttamente!");
	}

}
