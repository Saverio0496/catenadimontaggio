package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
public class AutomobileDAOImplMock implements AutomobileDAO {

	@Override
	public void insert(Automobile automobileInput) {
		for (SlotCatenaDiMontaggio catenaDiMontaggioItem : DbMock.CATENEDIMONTAGGIO) {
			if (catenaDiMontaggioItem.getId() == automobileInput.getSlotCatenaDiMontaggio().getId())
				catenaDiMontaggioItem.addToAutomobili(automobileInput);
		}
	}

}
