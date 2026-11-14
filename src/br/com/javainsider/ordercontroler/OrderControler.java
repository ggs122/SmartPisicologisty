package br.com.javainsider.ordercontroler;

import br.com.javainsider.client.clientinterface.ClientInterface;

public class OrderControler {


    private ClientInterface clientInterface;
    private OrderControler orderController;

    public OrderControler() {}

    private OrderControler(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    public void injectOrderClient(ClientInterface clientInterface) {
        orderController = new OrderControler(clientInterface);

    }

    public void orderControllerCreateClient(String clientFirstName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neigbborhood, String city, String state, String clientCellPhone) {
        clientInterface.createClient(clientFirstName, clientMidleName, clientLastName, clientID, clientCpf, streetAdress, cepStreet, numberHouse, neigbborhood, city, state, clientCellPhone);
    }

    public void orderControlerPrintClient() {
        clientInterface.printClients();
    }

}
