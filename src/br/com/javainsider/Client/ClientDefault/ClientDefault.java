package br.com.javainsider.Client.ClientDefault;

import java.time.LocalDate;

public abstract class ClientDefault {

    private long clientId;
    private static long staticClientId;
    private String clientFullName;
    private String clientID;
    private String clientCpf;
    private String clientAdress;
    private String clientCellPhone;
    private LocalDate CreatedAt;

    public ClientDefault(long clientId, String clientFullName, String clientID, String clientCpf, String clientAdress, LocalDate createdAt, String clientCellPhone) {
        this.clientId = clientId;
        this.clientFullName = clientFullName;
        this.clientID = clientID;
        this.clientCpf = clientCpf;
        this.clientAdress = clientAdress;
        CreatedAt = createdAt;
        this.clientCellPhone = clientCellPhone;
    }

    protected String getClientFullName() {
        return clientFullName;
    }

    protected void setClientFullName(String clientFullName) {
        this.clientFullName = clientFullName;
    }

    protected String getClientID() {
        return clientID;
    }

    protected void setClientID(String clientID) {
        this.clientID = clientID;
    }

    protected String getClientAdress() {
        return clientAdress;
    }

    protected void setClientAdress(String clientAdress) {
        this.clientAdress = clientAdress;
    }

    protected String getClientCpf() {
        return clientCpf;
    }

    protected void setClientCpf(String clientCpf) {
        this.clientCpf = clientCpf;
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

}
