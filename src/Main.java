public class Main {
    public static void main(String[] args) {
        try{
            Agenda a = new Agenda();

            Paciente p1 = new Paciente("Túlio", "Santos", "2222222", "9999999");
            Paciente p2 = new Paciente("Leo", "Taddeo", "1111111", "888888888");
            Paciente p3 = new Paciente("Fulano", "Sicrano", "333333333", "777777777");
            Paciente p4 = new Paciente("Beltrano", "Sicrano", "444444444", "666666666");

            Consulta c1 = new Consulta(p1, 23, 4, 2022, 17);
            Consulta c2 = new Consulta(p2, 23, 4, 2022, 10);
            Consulta c3 = new Consulta(p3, 23, 4, 2022, 13);
            Consulta c4 = new Consulta(p3, 23, 4, 2022, 15);

            System.out.println("-----Consulta 1----- ");
            a.adicionar(c1);
            a.confirmar(c1);
            a.realizar(c1);

            System.out.println(" ");

            System.out.println("-----Consulta 2----- ");
            a.adicionar(c2);
            a.confirmar(c2);

            System.out.println(" ");

            System.out.println("-----Consulta 3----- ");
            a.adicionar(c3);
            a.confirmar(c3);
            a.cancelar(c3);

            System.out.println("-----Consulta 4----- ");
            a.adicionar(c4);



            a.listar(23, 4, 2022);
            System.out.println(" ");


            a.pesquisar("555555555");

            System.out.println(p1.toString());
            System.out.println(p2.toString());
            System.out.println(p3.toString());
            System.out.println(p4.toString());

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}