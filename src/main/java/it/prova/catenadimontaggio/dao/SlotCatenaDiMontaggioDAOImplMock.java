package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
public class SlotCatenaDiMontaggioDAOImplMock implements SlotCatenaDiMontaggioDAO {

	@Override
	public SlotCatenaDiMontaggio get(Long id) {
		for (SlotCatenaDiMontaggio catenaDiMontaggioItem : DbMock.CATENEDIMONTAGGIO) {
			if (catenaDiMontaggioItem.getId() == id)
				return catenaDiMontaggioItem;
		}
		return null;
	}

	@Override
	public void addAutomobileToCatenaDiMontaggio(Automobile automobileInput,
			SlotCatenaDiMontaggio catenaDiMontaggioInput) {
		automobileInput.setSlotCatenaDiMontaggio(catenaDiMontaggioInput);
		for (SlotCatenaDiMontaggio catenaDiMontaggioItem : DbMock.CATENEDIMONTAGGIO) {
			if (catenaDiMontaggioItem.getId() == catenaDiMontaggioInput.getId())
				catenaDiMontaggioItem.addToAutomobili(automobileInput);
		}
	}
}
