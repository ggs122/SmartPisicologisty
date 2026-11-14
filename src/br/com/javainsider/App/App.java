package br.com.javainsider.App;

import br.com.javainsider.client.clientinterface.ClientInterface;
import br.com.javainsider.client.ClientImpl;
import br.com.javainsider.ordercontroler.*;

public class App {

    static void main(String[] args) {

        ClientInterface clientInterface = new ClientImpl();
        clientInterface.createClient("Rogério", "Lopes", "de Souza", "21.141.758-5", "205.568.985-70", "Rua do Rosário", "25.812-345", 45, "Vila Geral", "São Cristovão", "RJ", "(21)985586677");
        clientInterface.printClients();

    }

}
