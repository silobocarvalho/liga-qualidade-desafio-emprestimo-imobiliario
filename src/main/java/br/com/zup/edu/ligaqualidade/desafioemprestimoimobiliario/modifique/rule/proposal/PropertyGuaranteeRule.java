package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proposal;

import java.util.List;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.analyzer.LineAnalyzer;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.Rule;

public class PropertyGuaranteeRule implements Rule {

	/*Deve haver no m�nimo 1 garantia de im�vel por proposta */
	
	public boolean check(List<String> lines) {

		for (String line : lines) {
            if (LineAnalyzer.isWarranty(line)) {
                return true;
            }
        }
		return false;
	}

}
