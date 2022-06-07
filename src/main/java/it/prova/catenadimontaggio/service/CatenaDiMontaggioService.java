package it.prova.catenadimontaggio.service;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface CatenaDiMontaggioService {

	public void avviaCatenaDiMontaggio(SlotCatenaDiMontaggio catenaDiMontaggioInput);

	public SlotCatenaDiMontaggio caricaCatenaDiMontaggio(Long id);

	public void aggiungiAutomobileAllaCatenaDiMontaggio(Automobile automobileInput,
			SlotCatenaDiMontaggio catenaDiMontaggioInput);

}
