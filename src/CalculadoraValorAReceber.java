import javax.swing.JOptionPane;

public class CalculadoraValorAReceber {
    public static void main(String[] args) {
        Professor professor = new Professor();

        String nomeProfessor = JOptionPane.showInputDialog(null, "Digite o nome do professor:");
        professor.setNome(nomeProfessor);

        String[] opcoesRegime = {"CLT", "Horista", "PJ"};
        String regimePagamento = (String) JOptionPane.showInputDialog(
                null,
                "Selecione o regime de pagamento:",
                "Regime de Pagamento",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoesRegime,
                opcoesRegime[0]);

        professor.setRegimePagamento(regimePagamento);
        professor.calcularValorAReceber();
        professor.exibirResultado();
    }
}
