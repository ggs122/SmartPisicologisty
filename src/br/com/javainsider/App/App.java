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

        orderControler.orderControllerSetClientCpf("21.141.758-5", "206.568.985-70");

        orderControler.orderControllerSetClientID("209.568.985-70", "23.250.760-9");

        orderControler.orderControllerSetClientFirstName("206.568.985-70", "Rogéria");

        orderControler.orderControllerSetClientMidleName("206.568.985-70", "Silva");

        orderControler.orderControllerSetLastName("206.568.985-70", "de Lima");

        orderControler.orderControllerClientSetAdress("206.568.985-70", "Rua da Lapa");

        orderControler.orderControllerClientSetCellPhone("206.568.985-70", "(21)98548-6776");

        orderControler.orderControllerClientSetCep("206.568.985-70", "30.815-350");

        orderControler.orderControlerPrintClient();

    }

}
