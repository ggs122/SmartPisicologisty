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

    public void orderControllerSetClientCpf(String clientID, String newClientCpf) {
        client.setClientCpf(clientID, newClientCpf);
    }

    public void orderControllerSetClientID(String clientCpf, String newClientID) {
        client.setClientID(clientCpf, newClientID);
    }

    public void orderControllerSetClientFirstName(String clientCpf, String newClientFirstName) {
        client.setClientFirstname(clientCpf, newClientFirstName);
    }

    public void orderControllerSetClientMidleName(String clientCpf, String newClientMidleName) {
        client.setClientMidleName(clientCpf, newClientMidleName);
    }

    public void orderControllerSetLastName(String clientCpf, String newClientLastName) {
        client.setClientLastName(clientCpf, newClientLastName);
    }

    public void orderControllerClientSetAdress(String clientCpf, String newStreetAdress) {
        client.setClientAdress(clientCpf, newStreetAdress);
    }

    public void orderControllerClientSetCellPhone(String clientCpf, String newCellPhone) {
        client.setClientCellPhone(clientCpf, newCellPhone);
    }

    public void orderControllerClientSetCep(String clientCpf, String newCepStreet) {
        client.setCepStreet(clientCpf, newCepStreet);
    }

    public void orderControllerClientSetNumberHouse(String clientCpf, long newNumberHouse) {
        client.setNumberHouse(clientCpf, newNumberHouse);
    }

    public void orderControllerClientSetNeighborhood(String clientCpf, String newNeighborhood) {
        client.setNeighborhood(clientCpf, newNeighborhood);
    }

    public void orderControllerClientSetDeleteClient(String clientCpf) {
        client.deleteClient(clientCpf);
    }

    public void orderControllerClientSetCity(String clientCpf, String newCity) {
        client.setCity(clientCpf, newCity);
    }

    public void orderControllerClientSetState(String clientCpf, String newState) {
        client.setState(clientCpf, newState);
    }

    public void orderControlerPrintClient() {
        client.printClients();
    }

}
