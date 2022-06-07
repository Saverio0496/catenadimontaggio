package it.prova.catenadimontaggio;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
import it.prova.catenadimontaggio.service.CatenaDiMontaggioService;

@SpringBootApplication
public class CatenadimontaggioApplication implements CommandLineRunner {

	@Autowired
	private CatenaDiMontaggioService catenaDiMontaggioService;

	public static void main(String[] args) {
		SpringApplication.run(CatenadimontaggioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SlotCatenaDiMontaggio slotCatenaDiMontaggio = catenaDiMontaggioService.caricaCatenaDiMontaggio(1L);

		Automobile autoPerTest = new Automobile(44L, "F7", "7ATTJDSHJ",
				new SimpleDateFormat("dd/MM/yyyy").parse("06/08/2022"));

		catenaDiMontaggioService.aggiungiAutomobileAllaCatenaDiMontaggio(autoPerTest, slotCatenaDiMontaggio);

		catenaDiMontaggioService.avviaCatenaDiMontaggio(slotCatenaDiMontaggio);
	}

}
