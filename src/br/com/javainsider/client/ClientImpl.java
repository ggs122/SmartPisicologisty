package br.com.javainsider.client;

import br.com.javainsider.client.clientdefault.ClientDefault;
import br.com.javainsider.client.clientinterface.ClientInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClientImpl extends ClientDefault implements ClientInterface {

    static List<ClientImpl> clientsList = new ArrayList<>();

    protected ClientImpl(long clientId, String clientFirstName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neighborhood, String city, String state, String clientCellPhone, LocalDate createdAt) {
        super(clientId, clientFirstName, clientMidleName, clientLastName, clientID, clientCpf, streetAdress, cepStreet, numberHouse, neighborhood, city, state, clientCellPhone, createdAt);
    }

    public ClientImpl(){}

    @Override
    public void createClient(String clientFirstName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neigbborhood, String city, String state, String clientCellPhone) {
        ClientImpl client = new ClientImpl(staticClientId, clientFirstName, clientMidleName, clientLastName, clientID, clientCpf, streetAdress, cepStreet, numberHouse, neigbborhood, city, state, clientCellPhone, LocalDate.now());
        clientsList.add(client);
    }

    @Override
    protected void findClientByCpf(String clientCpf) {

    }

    @Override
    protected void findClientByID(String clientID) {

    }

    @Override
    protected void setClientCpf(String clientID, String newClientCpf) {

    }

    @Override
    protected void setClientID(String clientCpf, String newClientID) {

    }

    @Override
    protected void setClientFirstname(String clientCpf, String newClientFirstName) {

    }

    @Override
    protected void setClientMidleName(String clientCpf, String newClientMidleName) {

    }

    @Override
    protected void setClientLastName(String clientCpf, String newClientLastName) {

    }

    @Override
    protected void setClientAdress(String clientCpf, String newAdress) {

    }

    @Override
    protected void setClientCellPhone(String clientCpf, String newCellPhone) {

    }

    @Override
    protected void setStreetAdress(String clientCpf, String newStreetCpf) {

    }

    @Override
    protected void setCepStreet(String clientCpf, String newCepStreet) {

    }

    @Override
    protected void setNumberHouse(String clientCpf, long newNumberHouse) {

    }

    @Override
    protected void setNeighborhood(String clientCpf, String newNeighborhood) {

    }

    @Override
    protected void setCity(String clientCpf, String newCity) {

    }

    @Override
    protected void setState(String clientCpf, String newState) {

    }

    @Override
    protected void setCreatedAT(String clientCpf, LocalDate newCreatedAt) {

    }

    @Override
    protected void deleteClient(String clientCpf) {

    }

    @Override
    public void printClients() {
        clientsList
                .forEach(c -> IO.println(c));
    }
}
