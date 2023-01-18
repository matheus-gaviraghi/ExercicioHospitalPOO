import pessoas.Atendente;
import pessoas.Funcionario;
import pessoas.Paciente;
import pessoas.Pessoa;
import quadroDeMedicos.Cirurgiao;
import quadroDeMedicos.ClinicoGeral;
import quadroDeMedicos.Neuro;
import utilidades.Atendimento;
import utilidades.Sala;

public class Main {
    public static void main(String[] args) {

        // Criação de salas
        Sala sala1 = new Sala("Sala 103", 1);
        Sala sala2 = new Sala("Sala 203", 2);
        Sala sala3 = new Sala("Sala 208", 2);

        // Criação dos médicos
        ClinicoGeral clinico1 = new ClinicoGeral("Ricardo", 32, "CG-01");
        Neuro neuro1 = new Neuro("Fernando", 45, "N-01");
        Cirurgiao cirurgiao1 = new Cirurgiao("Ricardo", 32, "N-01");

        // Criação dos pacientes
        Paciente paciente1 = new Paciente("Matheus", 22, "UNIMED-243");
        paciente1.addSintoma("Dor nos olhos");
        paciente1.addSintoma("Dor de cabeça");
        paciente1.addSintoma("Enjôo");

        Paciente paciente2 = new Paciente("Matheus", 22, "UNIMED-243");
        paciente2.addSintoma("Dor intensa no abdômen");
        paciente2.addSintoma("Febre persistente");
        paciente2.addSintoma("Diarréia");

        Paciente paciente3 = new Paciente("José", 43, "IPE-28");
        paciente3.addSintoma("Dificuldade para falar");
        paciente3.addSintoma("Paralisia de um membro");
        paciente3.addSintoma("Vertigem");
        paciente3.addSintoma("Visão turva");

        // Criação dos atendentes
        Atendente atendente1 = new Atendente("Rosa", 53, "AT-01");
        atendente1.iniciarAtendimento();

        // Apresentando o quadro de funionários do hospital
        System.out.println("#####################################");
        System.out.println("Quadro de funcionários do hospital");
        System.out.println("\nAtendentes:");
        System.out.println(atendente1);

        System.out.println("\nMédicos:");
        System.out.println(clinico1);
        System.out.println();
        System.out.println(neuro1);
        System.out.println();
        System.out.println(cirurgiao1);


        // Apresentando os pacientes a consultarem
        System.out.println("\n###########################");
        System.out.println("Pacientes");

        System.out.println("Paciente 1: ");
        System.out.println(paciente1);
        System.out.println();
        System.out.println("Paciente 2: ");
        System.out.println(paciente2);
        System.out.println();
        System.out.println("Paciente 3: ");
        System.out.println(paciente3);

        // Verificando se o paciente2 é o mesmo que o paciente1
        System.out.println("\nO paciente1 é o mesmo que o paciente2? " + paciente1.equals(paciente2));

        // Realizando o atendimento dos pacientes
        atendente1.addPacienteAtendido();
        atendente1.getAtendimento().organizarSalaConsulta(sala1, 18, 01, 2023);

        atendente1.addPacienteAtendido();
        atendente1.getAtendimento().organizarSalaConsulta(sala2, 18, 01, 2023);

        System.out.println("\nTentando agendar uma sala já agendada: ");
        atendente1.getAtendimento().organizarSalaConsulta(sala1, 18, 01, 2023);

        // Diagnóstico dos pacientes
        String quadroPaciente1 = clinico1.realizarDiagnostico(paciente1.sintomas());
        paciente1.setQuadroClinico(quadroPaciente1);
        sala1.liberarSala(); // após o atendimento, a sala é liberada

        String quadroPaciente2 = cirurgiao1.realizarDiagnostico(paciente2.sintomas());
        paciente2.setQuadroClinico(quadroPaciente2);
        sala2.liberarSala(); // após o atendimento, a sala é liberada

        if(!sala1.isSalaReservada()){
            atendente1.getAtendimento().organizarSalaConsulta(sala1, 18, 01, 2023);
        }

        String quadroPaciente3 = neuro1.realizarDiagnostico(paciente3.sintomas());
        paciente3.setQuadroClinico(quadroPaciente3);
        sala1.liberarSala(); // após o atendimento, a sala é liberada


        // Mostrando os diagnósticos dos pacientes consultados
        System.out.println("\n############################");
        System.out.println("Informações dos pacientes atualizadas após a consulta");
        System.out.println("Paciente 1: ");
        System.out.println(paciente1);
        System.out.println();
        System.out.println("Paciente 2: ");
        System.out.println(paciente2);
        System.out.println();
        System.out.println("Paciente 3: ");
        System.out.println(paciente3);
    }
}