import javax.swing.JOptionPane;

public class Professor {
    private String nome;
    private String regimePagamento;
    private double valorAReceber;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegimePagamento(String regimePagamento) {
        this.regimePagamento = regimePagamento;
    }

    public void calcularValorAReceber() {
        if (regimePagamento.equals("CLT")) {
            double salarioMensal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário mensal do professor:"));
            valorAReceber = salarioMensal;
        } else if (regimePagamento.equals("Horista")) {
            double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o número de horas trabalhadas:"));
            double valorHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da hora de trabalho:"));
            valorAReceber = horasTrabalhadas * valorHora;
        } else if (regimePagamento.equals("PJ")) {
            double valorContrato = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do contrato:"));
            valorAReceber = valorContrato;
        }
    }

    public void exibirResultado() {
        JOptionPane.showMessageDialog(null, "Nome do professor: " + nome + "\nValor a receber: " + valorAReceber);
    }
}

