package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.dao.SlotCatenaDiMontaggioDAO;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Service
public class CatenaDiMontaggioServiceImpl implements CatenaDiMontaggioService {

	@Autowired
	private TelaioService telaioService;
	@Autowired
	private MotoreService motoreService;
	@Autowired
	private ImpiantoElettricoService impiantoElettricoService;
	@Autowired
	private CarrozzeriaService carrozzeriaService;
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
	@Autowired
	private SlotCatenaDiMontaggioDAO slotCatenaDiMontaggioDAO;

	@Override
	public void avviaCatenaDiMontaggio(SlotCatenaDiMontaggio catenaDiMontaggioInput) {
		System.out.println("Inizio catena di montaggio!");
		for (Automobile automobileItem : catenaDiMontaggioInput.getAutomobili()) {
			System.out.println("Inizio montaggio dell'automobile :" + automobileItem);
			telaioService.montaTelaio(automobileItem);
			motoreService.montaMotore(automobileItem);
			impiantoElettricoService.installaImpianto(automobileItem);
			carrozzeriaService.costruisciCarrozzeria(automobileItem);
			provaSuStradaService.effettuaProvaSuStrada(automobileItem);
			System.out.println("Fine montaggio dell'automobile :" + automobileItem);
		}
		System.out.println("Fine catena di montaggio!");
	}

	@Override
	public SlotCatenaDiMontaggio caricaCatenaDiMontaggio(Long id) {
		return slotCatenaDiMontaggioDAO.get(id);
	}

	@Override
	public void aggiungiAutomobileAllaCatenaDiMontaggio(Automobile automobileInput,
			SlotCatenaDiMontaggio catenaDiMontaggioInput) {
		slotCatenaDiMontaggioDAO.addAutomobileToCatenaDiMontaggio(automobileInput, catenaDiMontaggioInput);
	}

}
