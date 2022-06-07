package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class CarrozzeriaServiceImpl implements CarrozzeriaService {

	@Override
	public void costruisciCarrozzeria(Automobile automobileInput) {
		System.out.println("Carrozzeria costruita correttamente!");
	}

}
