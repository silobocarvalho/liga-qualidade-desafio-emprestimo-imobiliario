package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proposal;

import java.util.List;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.analyzer.LineAnalyzer;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.Rule;

public class SumGuaranteeRule implements Rule {

	/*
	 * A soma do valor das garantias deve ser maior ou igual ao dobro do valor do empréstimo
	 * */
	
	public boolean check(List<String> lines) {

		for (String line : lines) {
			System.out.println(line);
			if (LineAnalyzer.isWarranty(line)) {
                //FALTA FAZER
				System.out.println("WAR: " + line);
            	return true;
            }
        }
		return false;
	}

}
