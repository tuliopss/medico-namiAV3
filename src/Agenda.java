import java.util.ArrayList;
import java.util.List;
public class Agenda {
    public ArrayList<Consulta> consultas = new ArrayList<Consulta>(); //item a)

    public void adicionar(Consulta consulta) { //item b)
        if (disponibilidade(consulta) && consulta.getStatus() == 0) {
            this.consultas.add(consulta);
            System.out.println("Consulta agendada com sucesso!");
        } else {
            throw new RuntimeException("Horário Ocupado");
        }
    }

    private boolean disponibilidade(Consulta consulta) {
        boolean disponibilidade = true;

        for (Consulta consult: this.consultas) {
            if (consult.equals(consulta)) {
                disponibilidade = false;
            }
        }
        return disponibilidade;
    }
    public void confirmar(Consulta consulta) { //item c
        boolean reservado = !disponibilidade(consulta);
        if (reservado) {
            if (consulta.getStatus() == 0) {
                consulta.setStatus(1);
                System.out.println("Consulta confirmada!");
            } else if (consulta.getStatus() > 0) {
                throw new RuntimeException("Status Inválido");
            } else {
                throw new RuntimeException("Consulta não encontrada");
            }
        } else {
            throw new RuntimeException("Horário Ocupado!");
        }
    }

    public void realizar(Consulta consulta){ //item d)
        if(consulta.getStatus() == 1) {
            consulta.setStatus(2);
            System.out.println("Realizado");
        } else if (consulta.getStatus() != 1) {
            throw new RuntimeException("Status Inválido");
        } else {
            throw new RuntimeException("Consulta não encontrada");
        }
    }

    public void cancelar(Consulta consulta) { //item e)
        if (consulta.getStatus() == 0 || consulta.getStatus() == 1) {
            consulta.setStatus(3);
            System.out.println("Consulta cancelada com sucesso.");
        } else if (consulta.getStatus() > 1) {
            throw new RuntimeException("Status inválido");
        } else {
            throw new RuntimeException("Consulta não encontrada");
        }
    }

    public void listar(int dia, int mes,int ano) { //item f)
        List<Consulta> agenda = new ArrayList<Consulta>();
        for (Consulta consulta: this.consultas) {
            if (consulta.getDia() == dia && consulta.getMes() == mes && consulta.getAno() == ano) {
                agenda.add(consulta);
            }
        }
        for (Consulta consultaOk: agenda) {
            consultaOk.mostrar();
        }
    }

    public void pesquisar(String cpf) { //item g)
        List<Consulta> agenda = new ArrayList<Consulta>();
        for (Consulta consulta: this.consultas) {
            if (consulta.getPaciente().getCpf() == cpf) {
                agenda.add(consulta);
            } else {
                System.out.println("CPF não foi encontrado.");
                break;
            }
        }
        for (Consulta consultaOn: agenda) {
            consultaOn.mostrar();
        }
    }





}
