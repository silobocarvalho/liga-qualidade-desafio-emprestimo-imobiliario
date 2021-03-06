package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.analyzer;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.enums.BASE_COLUMNS;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.enums.PROPONENT_COLUMNS;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.enums.PROPOSAL_COLUMNS;

/**
 * Precisa dividir isso aqui =D
 */
public class LineAnalyzer {

    private static final String PROPOSAL = "proposal";
    private static final String WARRANTY = "warranty";
    private static final String PROPONENT = "proponent";

    public static boolean isProposal(String line) {
        return line.split(",")[BASE_COLUMNS.EVENT_SCHEMA.ordinal()].equals(PROPOSAL);
    }

    public static Boolean isProposalValueValid(String line) {
        if(LineAnalyzer.isProposal(line)) {
            Double loanValue = Double.valueOf(line.split(",")[PROPOSAL_COLUMNS.PROPOSAL_LOAN_VALUE.ordinal()]);
            return loanValue > 30000 && loanValue < 3000000;
        }
        return null;
    }

    public static boolean isWarranty(String line) {
        return line.split(",")[BASE_COLUMNS.EVENT_SCHEMA.ordinal()].equals(WARRANTY);
    }

    public static boolean isProponent(String line) {
        return line.split(",")[BASE_COLUMNS.EVENT_SCHEMA.ordinal()].equals(PROPONENT);
    }

    public static boolean isPrincipalProponent(String line) {
        return LineAnalyzer.isProponent(line) && line.split(",")[PROPONENT_COLUMNS.PROPONENT_IS_MAIN.ordinal()].equals("true");
    }

    public static Boolean isProponentAgeValid(String line) {
        if(LineAnalyzer.isProponent(line)) {
            Integer age = Integer.valueOf(line.split(",")[PROPONENT_COLUMNS.PROPONENT_AGE.ordinal()]);
            return age >= 18;
        }
        return null;
    }

}
