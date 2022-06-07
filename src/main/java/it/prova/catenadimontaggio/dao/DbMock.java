package it.prova.catenadimontaggio.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class DbMock {

	public static final List<SlotCatenaDiMontaggio> CATENEDIMONTAGGIO = new ArrayList<SlotCatenaDiMontaggio>();

	static {
		try {
			SlotCatenaDiMontaggio catenaDiMontaggio = new SlotCatenaDiMontaggio(1L, "Ferrari", "Italia");
			Automobile automobile1 = new Automobile(60L, "F50", "5FJADHIA",
					new SimpleDateFormat("dd/MM/yyyy").parse("23/07/2015"));
			catenaDiMontaggio.addToAutomobili(automobile1);
			Automobile automobile2 = new Automobile(210L, "F11", "7ASHAJSH",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/03/2021"));
			catenaDiMontaggio.addToAutomobili(automobile2);
			Automobile automobile3 = new Automobile(3L, "F300", "9ASJDSHJ",
					new SimpleDateFormat("dd/MM/yyyy").parse("15/04/2019"));
			catenaDiMontaggio.addToAutomobili(automobile3);
			CATENEDIMONTAGGIO.add(catenaDiMontaggio);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}