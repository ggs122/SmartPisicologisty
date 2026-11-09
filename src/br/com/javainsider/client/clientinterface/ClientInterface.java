package br.com.javainsider.client.clientinterface;

public interface ClientInterface {

    void createClient(String clientFirstName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neigbborhood, String city, String state, String clientCellPhone);
    void printClients();

}
