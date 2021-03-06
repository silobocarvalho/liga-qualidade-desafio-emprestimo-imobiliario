package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.analyzer.LineAnalyzer;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.Rule;
import java.util.List;

public class ValueProposalRule implements Rule {

    public boolean check(List<String> lines) {
        boolean check = true;
        for (String line : lines) {
            check = check && (LineAnalyzer.isProposalValueValid(line) != null ? LineAnalyzer.isProposalValueValid(line) : true);
        }
        return check;
    }
}
