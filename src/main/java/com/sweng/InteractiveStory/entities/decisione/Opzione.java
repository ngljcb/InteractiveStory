package com.sweng.InteractiveStory.entities.decisione;
import com.sweng.InteractiveStory.entities.utils.Oggetto;
import com.sweng.InteractiveStory.entities.Scenario;

public class Opzione {
    Oggetto oggetto;
    String nome;
    boolean sbloccato = false;

    public Opzione(Oggetto oggetto, String nome) {
        this.oggetto = oggetto;
        this.nome = nome;
        this.sbloccato = false;
    }
    
    Scenario goToScenario(Scenario scenarioAttuale, Scenario scenarioSuccessivo){
        if (sbloccato){
            return scenarioSuccessivo;
        } else {
            return scenarioAttuale;

        }
    }

    void verificaOggettoPosseduto(Oggetto oggetto){
        sbloccato = this.oggetto.getNome().equals(oggetto.getNome());
    }

    public String getNome() {
        return nome;
    }

}



