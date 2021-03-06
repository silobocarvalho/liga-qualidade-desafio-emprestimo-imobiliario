package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proposal;

import java.util.List;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.analyzer.LineAnalyzer;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.Rule;

public class PropertyGuaranteeRule implements Rule {

	/*Deve haver no mínimo 1 garantia de imóvel por proposta */
	
	public boolean check(List<String> lines) {

		for (String line : lines) {
            if (LineAnalyzer.isWarranty(line)) {
                return true;
            }
        }
		return false;
	}

}
