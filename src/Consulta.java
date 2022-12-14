import java.util.Objects;

public class Consulta {
        private Paciente paciente;
        private int dia, mes, ano, hora, status;

        public Paciente getPaciente() {
            return paciente;
        }

        public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
        }

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public int getMes() {
            return mes;
        }

        public void setMes(int mes) {
            this.mes = mes;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public int getHora() {
            return hora;
        }

        public void setHora(int hora) {
            this.hora = hora;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public Consulta(Paciente paciente, int dia, int mes, int ano, int hora) {
            this.paciente = paciente;
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.hora = hora;
            this.status = 0;
        }

        public void mostrar() {
            System.out.println("-----------------------------");
            System.out.println("Data: " + getDia() + "/" + getMes() + "/" + getAno());
            System.out.println("Hora: " + getHora());
            System.out.println("Consulta: " + getStatus());
            System.out.println("-----------------------------");


        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = (Consulta) o;
        return dia == consulta.dia && mes == consulta.mes && ano == consulta.ano && hora == consulta.hora;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, ano, hora);
    }
    }

