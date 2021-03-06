package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.analyzer.ProposalAnalyzer;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.enums.BASE_COLUMNS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solucao {

    public static String processMessages(List<String> messages) {

        StringBuilder proposalsApproved = new StringBuilder();
        Map<String, List<String>> proposals = new HashMap<String, List<String>>();

        for(String line : messages) {
            String currentProposalId = line.split(",")[BASE_COLUMNS.PROPOSAL_ID.ordinal()];
            if (!proposals.containsKey(currentProposalId)) {
                proposals.put(currentProposalId, new ArrayList<String>());
            }
            proposals.get(currentProposalId).add(line);
        }

        for (List<String> linesOfProposal: proposals.values()) {
            ProposalAnalyzer.analyse(linesOfProposal);
        }
        return proposalsApproved.toString();
    }
}