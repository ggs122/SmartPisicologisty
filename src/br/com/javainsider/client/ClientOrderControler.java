package br.com.javainsider.client;

import br.com.javainsider.client.clientinterface.ClientInterface;

public class ClientOrderControler {

    private ClientImpl client = new ClientImpl();

    public ClientOrderControler() {}

    public void orderControllerCreateClient(String clientFirstName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neigbborhood, String city, String state, String clientCellPhone) {
        client.createClient(clientFirstName, clientMidleName, clientLastName, clientID, clientCpf, streetAdress, cepStreet, numberHouse, neigbborhood, city, state, clientCellPhone);
    }

    public void orderControlerPrintClient() {
        client.printClients();
    }

}
