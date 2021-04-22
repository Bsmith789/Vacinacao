package prova;

import javax.swing.*;

public class Vacinacao {

    public void getPeriodoDeVacinacao(Cidadao cidadao){
        cidadao.setNome(JOptionPane.showInputDialog("Digite seu nome"));

        cidadao.setIdade(JOptionPane.showInputDialog("Digita a sua idade:"));

        int idades = Integer.parseInt(cidadao.getIdade());

        if (idades >= 60 && idades <= 69) {
            JOptionPane.showMessageDialog(null, "A pessoa " + cidadao.getNome() + " de idade " + idades + " será vacinada em Abril");
        } else if (idades >= 50 && idades <= 59) {
            JOptionPane.showMessageDialog(null, "A pessoa " + cidadao.getNome() + " de idade " + idades + " será vacinada em Maio");
        } else if (idades >= 40 && idades <= 49) {
            JOptionPane.showMessageDialog(null, "A pessoa " + cidadao.getNome() + " de idade " + idades + " será vacinada em Junho");
        } else if (idades > 0 && idades < 40) {
            JOptionPane.showMessageDialog(null, "A pessoa " + cidadao.getNome() + " de idade " + idades + " será vacinada em Julho");
        } else {
            JOptionPane.showMessageDialog(null, "Você errou, tente novamente");
        }
    }

    public void getPeriodoDeVacinacao() {
        Cidadao cidadao = new Cidadao();
            do{
        cidadao.setNome(JOptionPane.showInputDialog("Digite seu nome"));

            cidadao.setIdade(JOptionPane.showInputDialog("Digita a sua idade:"));

            int idades = Integer.parseInt(cidadao.getIdade());

            if (idades >= 60 && idades <= 69) {
                JOptionPane.showMessageDialog(null, "A pessoa " + cidadao.getNome() + " de idade " + idades + " será vacinada em Abril");
                cidadao.getNome();
            } else if (idades >= 50 && idades <= 59) {
                JOptionPane.showMessageDialog(null, "A pessoa " + cidadao.getNome() + " de idade " + idades + " será vacinada em Maio");
                cidadao.getNome();
            } else if (idades >= 40 && idades <= 49) {
                JOptionPane.showMessageDialog(null, "A pessoa " + cidadao.getNome() + " de idade " + idades + " será vacinada em Junho");
                cidadao.getNome();
            } else if (idades > 0 && idades < 40) {
                JOptionPane.showMessageDialog(null, "A pessoa " + cidadao.getNome() + " de idade " + idades + " será vacinada em Julho");
                cidadao.getNome();
            } else if (idades >= 70) {
                JOptionPane.showMessageDialog(null, "Você já deve ter sido vacinado");
                cidadao.getNome();
            } else {
                JOptionPane.showMessageDialog(null, "Você errou, tente novamente");
                cidadao.getNome();
            }
        }while(!cidadao.getNome().equals("Sair"));
    }
}

