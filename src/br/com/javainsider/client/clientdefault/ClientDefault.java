package br.com.javainsider.client.clientdefault;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public abstract class ClientDefault {

    private long clientId = staticClientId;
    protected static long staticClientId = 10000;
    private String clientFirstName;
    private String clientMidleName;
    private String clientLastName;
    private String clientID;
    private String clientCpf;
    private String streetAdress;
    private String cepStreet;
    private long numberHouse;
    private String neighborhood;
    private String city;
    private String state;
    private String clientCellPhone;
    private LocalDate createdAt;
    private Locale localeBr = Locale.forLanguageTag("pt-BR");

    protected ClientDefault(long clientId, String clientFirstName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neighborhood, String city, String state, String clientCellPhone, LocalDate createdAt) {
        this.clientId = clientId;
        this.clientFirstName = clientFirstName;
        this.clientMidleName = clientMidleName;
        this.clientLastName = clientLastName;
        this.clientID = clientID;
        this.clientCpf = clientCpf;
        this.streetAdress = streetAdress;
        this.cepStreet = cepStreet;
        this.numberHouse = numberHouse;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.clientCellPhone = clientCellPhone;
        this.createdAt = createdAt;
    }

    protected ClientDefault(){}

    protected long getClientId() {
        return clientId;
    }

    protected void setClientId(long clientId) {
        this.clientId = clientId;
    }

    protected String getClientFirstName() {
        return clientFirstName;
    }

    protected void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    protected String getClientMidleName() {
        return clientMidleName;
    }

    protected void setClientMidleName(String clientMidleName) {
        this.clientMidleName = clientMidleName;
    }

    protected String getClientLastName() {
        return clientLastName;
    }

    protected void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    protected String getClientID() {
        return clientID;
    }

    protected void setClientID(String clientID) {
        this.clientID = clientID;
    }

    protected String getClientCpf() {
        return clientCpf;
    }

    protected void setClientCpf(String clientCpf) {
        this.clientCpf = clientCpf;
    }

    protected String getStreetAdress() {
        return streetAdress;
    }

    protected void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    protected String getCepStreet() {
        return cepStreet;
    }

    protected void setCepStreet(String cepStreet) {
        this.cepStreet = cepStreet;
    }

    protected long getNumberHouse() {
        return numberHouse;
    }

    protected void setNumberHouse(long numberHouse) {
        this.numberHouse = numberHouse;
    }

    protected String getNeighborhood() {
        return neighborhood;
    }

   protected void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

   protected String getCity() {
        return city;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    protected String getState() {
        return state;
    }

    protected void setState(String state) {
        this.state = state;
    }

    protected String getClientCellPhone() {
        return clientCellPhone;
    }

    protected void setClientCellPhone(String clientCellPhone) {
        this.clientCellPhone = clientCellPhone;
    }

   protected LocalDate getCreatedAt() {
        return createdAt;
    }

    protected void setCreatedAt(LocalDate createdAt) {
        createdAt = createdAt;
    }

    protected abstract void createClient(String clientFistName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neighborhood, String city, String state, String clientCellPhone);
    protected abstract void findClientByCpf(String clientCpf);
    protected abstract void findClientByID(String clientID);
    protected abstract void setClientCpf(String clientID, String newClientCpf);
    protected abstract void setClientID(String clientCpf, String newClientID);
    protected abstract void setClientFirstname(String clientCpf, String newClientFirstName);
    protected abstract void setClientMidleName(String clientCpf, String newClientMidleName);
    protected abstract void setClientLastName(String clientCpf, String newClientLastName);
    protected abstract void setClientAdress(String clientCpf, String newAdress);
    protected abstract void setClientCellPhone(String clientCpf, String newCellPhone);
    protected abstract void setStreetAdress(String clientCpf, String newStreetCpf);
    protected abstract void setCepStreet(String clientCpf, String newCepStreet);
    protected abstract void setNumberHouse(String clientCpf, long newNumberHouse);
    protected abstract void setNeighborhood(String clientCpf, String newNeighborhood);
    protected abstract void setCity(String clientCpf, String newCity);
    protected abstract void setState(String clientCpf, String newState);
    protected abstract void setCreatedAT(String clientCpf, LocalDate newCreatedAt);
    protected abstract void deleteClient(String clientCpf);
    protected abstract void printClients();

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String createdAtToString = createdAt.format(dateTimeFormatter).toString();
        return String.format(localeBr, "Id: %d | Nome: %s %s %-25s | ID.: %s | CPF: %s | Endereço: %-25s | CEP: %s | Casa Nº: %d | Bairro: %-25s | Cidade: %-15s | Estado: %s | Tell. Contato: %s | Data Cadastro: %s ", clientId, clientFirstName, clientMidleName, clientLastName, clientID, clientCpf, streetAdress, cepStreet, numberHouse, neighborhood, city, state, clientCellPhone, createdAtToString);
    }
}
