package pessoas;

import java.math.BigDecimal;
import java.util.List;

public abstract class Medico extends Funcionario {

    private BigDecimal salario;
    private final static double cargaHorariaMinima = 30.0;
    private final static BigDecimal valorHoraExtra = new BigDecimal(1200);

    public Medico(String nome, int idade){
        super(nome, idade);
    }

    public Medico(String nome, int idade, String registro){
        super(nome, idade, registro);
    }

    public Medico(String nome, int idade, String registro, BigDecimal salario){
        this(nome, idade, registro);
        this.salario = salario;
    }

    public abstract String realizarDiagnostico(List<String> sintomas);

    public final BigDecimal calcularSalario(double cargaHoraria){
        double quantidadeHorasExtras = cargaHoraria - cargaHorariaMinima;
        this.salario = new BigDecimal(25000);
        this.salario = this.salario.add(valorHoraExtra.multiply(BigDecimal.valueOf(quantidadeHorasExtras)));

        return salario;
    };

    public BigDecimal getSalario() {
        return salario;
    }

}
