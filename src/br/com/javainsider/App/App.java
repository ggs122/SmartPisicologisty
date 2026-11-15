package br.com.javainsider.App;

import br.com.javainsider.client.ClientOrderControler;

public class App {

    static void main(String[] args) {

        ClientOrderControler orderControler = new ClientOrderControler();
        orderControler.orderControllerCreateClient("Rogério", "Lopes", "de Souza", "21.141.758-5", "205.568.985-70", "Rua do Rosário", "25.812-345", 45, "Vila Geral", "São Cristovão", "RJ", "(21)98558-6677");
        orderControler.orderControllerCreateClient("Marcelo", "Silva", "Soares", "22.151.768-9", "305.570.990-90", "Rua do Acre", "20.715-245", 65, "Vila Olímpia", "Guapimirim", "RJ", "(21)98968-7755");
        orderControler.orderControllerCreateClient("Marcelo", "Silva", "Soares", "22.151.768-9", "305.570.990-90", "Rua do Acre", "20.715-245", 65, "Vila Olímpia", "Guapimirim", "RJ", "(21)98968-7755");

        orderControler.orderControllerFindClientByCpf("205.568.985-70");

        orderControler.orderControllerFindClientByID("22.151.768-9");

        orderControler.orderControlerPrintClient();

    }

}
