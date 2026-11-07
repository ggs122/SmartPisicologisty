package br.com.javainsider.Client.ClientDefault;

import java.time.LocalDate;

public abstract class ClientDefault {

    private long clientId;
    private static long staticClientId;
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
    private LocalDate CreatedAt;

    public ClientDefault(long clientId, String clientFirstName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neighborhood, String city, String state, String clientCellPhone, LocalDate createdAt) {
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
        CreatedAt = createdAt;
    }

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
        return CreatedAt;
    }

    protected void setCreatedAt(LocalDate createdAt) {
        CreatedAt = createdAt;
    }

    //TODO -> falta implementar mais métodos.
    protected abstract void createClient(String clientFullName, String clientID, String clientCpf, String clientAdress, LocalDate createdAt, String clientCellPhone);
    protected abstract void findClientByCpf(String clientCpf);
    protected abstract void findClientByID(String clientID);
    protected abstract void changeClientCpf(String clientID, String newClientCpf);
    protected abstract void changeClientID(String clientCpf, String newClientID);
    protected abstract void changeClientFullName(String clientCpf, String newFullName);
    protected abstract void changeClientAdress(String clientCpf, String newAdress);
    protected abstract void changeClientCellPhone(String clientCpf, String newCellPhone);

}
