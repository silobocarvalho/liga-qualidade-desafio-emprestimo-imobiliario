package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proposal.ValueProposalRule;
import java.util.ArrayList;
import java.util.List;

public class ProposalRules {

    public static List<Rule> getRules() {
        List<Rule> rules = new ArrayList<Rule>();

        rules.add(new ValueProposalRule());

        return rules;
    }

}
