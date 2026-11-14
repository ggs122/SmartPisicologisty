package br.com.javainsider.App;

import br.com.javainsider.client.ClientOrderControler;

public class App {

    static void main(String[] args) {

//        ClientInterface clientInterface = new ClientImpl();
//        clientInterface.createClient("Rogério", "Lopes", "de Souza", "21.141.758-5", "205.568.985-70", "Rua do Rosário", "25.812-345", 45, "Vila Geral", "São Cristovão", "RJ", "(21)985586677");
//        clientInterface.printClients();

        ClientOrderControler orderControler = new ClientOrderControler();
        orderControler.orderControllerCreateClient("Rogério", "Lopes", "de Souza", "21.141.758-5", "205.568.985-70", "Rua do Rosário", "25.812-345", 45, "Vila Geral", "São Cristovão", "RJ", "(21)985586677");
        orderControler.orderControllerCreateClient("Marcelo", "Silva", "Soares", "22.151.768-9", "305.570.990-90", "Rua do Acre", "20.715-245", 65, "Vila Olímpia", "Guapimirim", "RJ", "(21)989687755");
        orderControler.orderControlerPrintClient();

    }

}
