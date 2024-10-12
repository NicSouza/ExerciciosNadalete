package ex3;

public class CalculadoraSalario {

    public static double calcularSalarioLiquido(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();
        double salarioLiquido = 0;

        switch (cargo) {
            case DESENVOLVEDOR:
                if (salarioBase >= 3000) {
                    salarioLiquido = salarioBase * 0.80;
                } else {
                    salarioLiquido = salarioBase * 0.90;
                }
                break;
            case DBA:
            case TESTADOR:
                if (salarioBase >= 2000) {
                    salarioLiquido = salarioBase * 0.75;
                } else {
                    salarioLiquido = salarioBase * 0.85;
                }
                break;
            case GERENTE:
                if (salarioBase >= 5000) {
                    salarioLiquido = salarioBase * 0.70;
                } else {
                    salarioLiquido = salarioBase * 0.80;
                }
                break;
        }

        return salarioLiquido;
    }
}
