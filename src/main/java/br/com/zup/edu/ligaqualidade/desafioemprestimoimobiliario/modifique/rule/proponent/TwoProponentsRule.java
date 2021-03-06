package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proponent;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.analyzer.LineAnalyzer;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.Rule;
import java.util.List;

public class TwoProponentsRule implements Rule {
    public boolean check(List<String> lines) {
        int count = 0;
        for (String line : lines) {
            if (LineAnalyzer.isProponent(line)) {
                count++;
            }
        }
        return count >= 2;
    }
}
