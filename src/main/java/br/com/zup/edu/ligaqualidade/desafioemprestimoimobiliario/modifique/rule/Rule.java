package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule;

import java.util.List;

public interface Rule {
    boolean check(List<String> lines);
}
