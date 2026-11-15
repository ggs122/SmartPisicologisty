package br.com.javainsider.client;

public class ClientOrderControler {

    private ClientImpl client = new ClientImpl();

    public ClientOrderControler() {}

    public void orderControllerCreateClient(String clientFirstName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neigbborhood, String city, String state, String clientCellPhone) {
        client.createClient(clientFirstName, clientMidleName, clientLastName, clientID, clientCpf, streetAdress, cepStreet, numberHouse, neigbborhood, city, state, clientCellPhone);
    }


    public ClientImpl orderControllerFindClientByCpf(String clientCpf) {
        return client.findClientByCpf(clientCpf);
    }

    public ClientImpl orderControllerFindClientByID(String clientID) {
        return client.findClientByID(clientID);
    }

    public void orderControlerPrintClient() {
        client.printClients();
    }

}
