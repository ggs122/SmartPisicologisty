package br.com.javainsider.client;

import br.com.javainsider.client.clientdefault.ClientDefault;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ClientImpl extends ClientDefault {

    private Locale localeBr = Locale.forLanguageTag("pt-BR");

    static List<ClientImpl> clientsList = new ArrayList<>();

    protected ClientImpl(long clientId, String clientFirstName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neighborhood, String city, String state, String clientCellPhone, LocalDate createdAt) {
        super(clientId, clientFirstName, clientMidleName, clientLastName, clientID, clientCpf, streetAdress, cepStreet, numberHouse, neighborhood, city, state, clientCellPhone, createdAt);
    }

    protected ClientImpl(){}

    @Override
    protected void createClient(String clientFirstName, String clientMidleName, String clientLastName, String clientID, String clientCpf, String streetAdress, String cepStreet, long numberHouse, String neigbborhood, String city, String state, String clientCellPhone) {

        if (ClientUtils.checkingAll(clientID, clientCpf, cepStreet, clientCellPhone)) {
            if (checkingSameClientFullName(clientFirstName, clientMidleName, clientLastName) == false) {
                if (checkingSameID(clientID) == false) {
                    if (checkingSameCpf(clientCpf) == false) {

                        ClientImpl client = new ClientImpl(staticClientId++, clientFirstName, clientMidleName, clientLastName, clientID, clientCpf, streetAdress, cepStreet, numberHouse, neigbborhood, city, state, clientCellPhone, LocalDate.now());
                        clientsList.add(client);
                        IO.println("-----------------------------------------------------------------------------------------------------------------------------");
                        IO.println(String.format(localeBr, "Cliente: %s %s %s -> Cadastrado com sucesso!", clientFirstName, clientMidleName, clientLastName));
                        IO.println("-----------------------------------------------------------------------------------------------------------------------------");

                    } else {
                        IO.println("----------------------------------------------------------------------------------------------------");
                        IO.println("Verifique se o número de identidade está corretos e cadastre novamente.");
                        IO.println("----------------------------------------------------------------------------------------------------");
                    }
                } else {
                    IO.println("----------------------------------------------------------------------------------------------------");
                    IO.println("Verifique se o número de identidade está corretos e cadastre novamente.");
                    IO.println("----------------------------------------------------------------------------------------------------");
                }

            } else {
                IO.println("----------------------------------------------------------------------------------------------------");
                IO.println("Verifique o nome completo correto e cadastre novamente.");
                IO.println("----------------------------------------------------------------------------------------------------");
            }

        } else {
            IO.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
            IO.println(String.format(localeBr, "Formato de dados incorretos, impossível cadastrar o cliente -> %s %s %s", clientFirstName, clientMidleName, clientLastName));
            IO.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    private boolean checkingSameClientFullName(String clientFirstName, String clientMidleName, String clientLastName) {
        boolean isSameClient = clientsList
                .stream()
                .anyMatch(c -> c.getClientFirstName().equalsIgnoreCase(clientFirstName) && c.getClientMidleName().equalsIgnoreCase(clientMidleName) && c.getClientLastName().equalsIgnoreCase(clientLastName));
        if (isSameClient) {
            IO.println("----------------------------------------------------------------------------------------------------");
            IO.println(String.format(localeBr, "Cliente %s %s %s -> Já cadastrado anteriormente. Impossível cadastrar.", clientFirstName, clientMidleName, clientLastName));
            IO.println("----------------------------------------------------------------------------------------------------");
        } else {
            IO.println("----------------------------------------------------------------------------------------------------");
            IO.println(String.format(localeBr, "Cliente: %s %s %s -> Cadastrado com sucesso!", clientFirstName, clientMidleName, clientLastName));
            IO.println("----------------------------------------------------------------------------------------------------");
        }

        return isSameClient;
    }

    private boolean checkingSameID(String clientID) {
       boolean isSameClientID = clientsList
                .stream()
                .anyMatch(c -> c.getClientID().equals(clientID));
       if (isSameClientID) {
           IO.println("----------------------------------------------------------------------------------------------------");
           IO.println(String.format(localeBr, "Identidade Nº %s -> Já cadastrado anteriormente. Impossível cadastrar.", clientID));
           IO.println("----------------------------------------------------------------------------------------------------");
       } else {
           IO.println("----------------------------------------------------------------------------------------------------");
           IO.println(String.format(localeBr, "Identidade Nº %s -> cadastrado com sucesso.", clientID));
           IO.println("----------------------------------------------------------------------------------------------------");
       }
       return isSameClientID;
    }

    private boolean checkingSameCpf(String clientCpf) {
        boolean isSameClientCpf = clientsList
                .stream()
                .anyMatch(c -> c.getClientID().equals(clientCpf));
        if (isSameClientCpf) {
            IO.println("----------------------------------------------------------------------------------------------------");
            IO.println(String.format(localeBr, "CPF Nº %s -> Já cadastrado anteriormente. Impossível cadastrar.", clientCpf));
            IO.println("----------------------------------------------------------------------------------------------------");
        } else {
            IO.println("----------------------------------------------------------------------------------------------------");
            IO.println(String.format(localeBr, "CPF Nº %s -> cadastrado com sucesso.", clientCpf));
            IO.println("----------------------------------------------------------------------------------------------------");
        }
        return isSameClientCpf;
    }

    @Override
    protected ClientImpl findClientByCpf(String clientCpf) {
       boolean isSimilarCpf = clientsList
                .stream()
                .anyMatch(c -> c.getClientCpf().equals(clientCpf));

       if (isSimilarCpf) {
           clientsList
                   .stream()
                   .filter(c -> c.getClientCpf().equals(clientCpf))
                   .forEach(c -> {
                       IO.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                       IO.println("Cliente encontrado:");
                       IO.println();
                       IO.println(c);
                       IO.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                   });
       } else {
           IO.println("-------------------------------------------------------------------------------");
           IO.println(String.format(localeBr, "CPF Nº %s -> Inválido ou não cadastrado.", clientCpf));
           IO.println("-------------------------------------------------------------------------------");
       }


   return clientsList
               .stream()
               .filter(c -> c.getClientCpf().equals(clientCpf))
               .findFirst()
               .orElse(new ClientImpl(0, "","", "", "", "", "", "", 0, "", "", "", "", LocalDate.of(0001, 01, 01)));


    }

    @Override
    protected ClientImpl findClientByID(String clientID) {
        boolean isSimilarCpf = clientsList
                .stream()
                .anyMatch(c -> c.getClientID().equals(clientID));

        if (isSimilarCpf) {
            clientsList
                    .stream()
                    .filter(c -> c.getClientID().equals(clientID))
                    .forEach(c -> {
                        IO.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        IO.println("Cliente encontrado:");
                        IO.println();
                        IO.println(c);
                        IO.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    });
        } else {
            IO.println("-------------------------------------------------------------------------------");
            IO.println(String.format(localeBr, "Identidade Nº %s -> Inválido ou não cadastrado.", clientID));
            IO.println("-------------------------------------------------------------------------------");
        }


        return clientsList
                .stream()
                .filter(c -> c.getClientID().equals(clientID))
                .findFirst()
                .orElse(new ClientImpl(0, "","", "", "", "", "", "", 0, "", "", "", "", LocalDate.of(0001, 01, 01)));


    }

    @Override
    protected void setClientCpf(String clientID, String newClientCpf) {
        boolean isCpfFormat = ClientUtils.checkingCPF(newClientCpf);
        boolean isClientID = clientsList
                .stream()
                .anyMatch(c -> c.getClientID().equals(clientID));
        if (isCpfFormat) {
            if (isClientID) {
                clientsList
                    .stream()
                    .filter(c -> c.getClientID().equals(clientID))
                    .forEach(c -> {
                        c.setClientCpf(newClientCpf);
                        IO.println(String.format(localeBr, "Cliente Nome: %s %s %s, CPF alterado para: %s -> com sucesso!", c.getClientFirstName(), c.getClientMidleName(), c.getClientLastName(), c.getClientCpf()));
                    });
            } else {
               IO.println(String.format(localeBr, "Formato de identidade inválido.\nou\nIdentidade inexistente.", clientID));
            }
        } else {
            IO.println(String.format(localeBr, "Formato de CPF %s -> Inválido!", newClientCpf));
        }
    }

    @Override
    protected void setClientID(String clientCpf, String newClientID) {
       boolean isFormatClientID = ClientUtils.checkingID(newClientID);

        boolean isSimilarClientCpf = clientsList
                .stream()
                .anyMatch(c -> c.getClientCpf().equals(clientCpf));
        if (isFormatClientID) {
            if (isSimilarClientCpf) {
                clientsList
                        .stream()
                        .filter(c -> c.getClientCpf().equals(clientCpf))
                        .forEach(c -> {
                            c.setClientID(newClientID);
                            IO.println(String.format(localeBr, "Cliente Nome: %s %s %s, Identidade alterado para: %s -> com sucesso!", c.getClientFirstName(), c.getClientMidleName(), c.getClientLastName(), c.getClientID()));
                        });
            } else {
                IO.println(String.format(localeBr, "CPF %s, inválido ou inexistente -> Impossível alterar a identidade para: %s",clientCpf ,newClientID));
            }

        } else {
            IO.println(String.format(localeBr, "Formato de identidade %s -> inválido.", newClientID));
        }

    }

    @Override
    protected void setClientFirstname(String clientCpf, String newClientFirstName) {
       boolean isFormatCpf = ClientUtils.checkingCPF(clientCpf);
       boolean isSimilarCpf = clientsList
                .stream()
                .anyMatch(c -> c.getClientCpf().equals(clientCpf));

       if (isFormatCpf) {
           if (isSimilarCpf) {
               clientsList
                       .stream()
                       .filter(c -> c.getClientCpf().equals(clientCpf))
                       .forEach(c -> {
                           c.setClientFirstName(newClientFirstName);
                           IO.println(String.format(localeBr, "Cliente CPF Nº %s -> Nome alterado para: %s, com sucesso!", c.getClientCpf(), c.getClientFirstName()));
                       });
           } else {
               IO.println(String.format(localeBr, "CPF Nº %s -> Não encontrado", clientCpf));
           }
       } else {
           IO.println(String.format(localeBr, "Impossível alterar o nome do cliente para: %s com o CPF %s informado!", newClientFirstName, clientCpf));
       }
    }

    @Override
    protected void setClientMidleName(String clientCpf, String newClientMidleName) {
        boolean isFormatCpf = ClientUtils.checkingCPF(clientCpf);
        boolean isSimilarCpf = clientsList
                .stream()
                .anyMatch(c -> c.getClientCpf().equals(clientCpf));

        if (isFormatCpf) {
            if (isSimilarCpf) {
                clientsList
                        .stream()
                        .filter(c -> c.getClientCpf().equals(clientCpf))
                        .forEach(c -> {
                            c.setClientMidleName(newClientMidleName);
                            IO.println(String.format(localeBr, "Cliente CPF Nº %s -> Nome do meio alterado para: %s, com sucesso!", c.getClientCpf(), c.getClientMidleName()));
                        });
            } else {
                IO.println(String.format(localeBr, "CPF Nº %s -> Não encontrado", clientCpf));
            }
        } else {
            IO.println(String.format(localeBr, "Impossível alterar o nome do cliente para: %s com o CPF %s informado!", newClientMidleName, clientCpf));
        }
    }

    @Override
    protected void setClientLastName(String clientCpf, String newClientLastName) {
        boolean isFormatCpf = ClientUtils.checkingCPF(clientCpf);
        boolean isSimilarCpf = clientsList
                .stream()
                .anyMatch(c -> c.getClientCpf().equals(clientCpf));

        if (isFormatCpf) {
            if (isSimilarCpf) {
                clientsList
                        .stream()
                        .filter(c -> c.getClientCpf().equals(clientCpf))
                        .forEach(c -> {
                            c.setClientLastName(newClientLastName);
                            IO.println(String.format(localeBr, "Cliente CPF Nº %s -> último nome alterado para: %s, com sucesso!", c.getClientCpf(), c.getClientLastName()));
                        });
            } else {
                IO.println(String.format(localeBr, "CPF Nº %s -> Não encontrado", clientCpf));
            }
        } else {
            IO.println(String.format(localeBr, "Impossível alterar o último nome do cliente para: %s com o CPF %s informado!", newClientLastName, clientCpf));
        }
    }

    //TODO -> Parei aqui.
    @Override
    protected void setClientAdress(String clientCpf, String newStreetAdress) {
       boolean isFormatCpf = ClientUtils.checkingCPF(clientCpf);
       boolean isSimilarStreetAdress = clientsList
                .stream()
                .anyMatch(c -> c.getStreetAdress().equalsIgnoreCase(newStreetAdress));
       if (isFormatCpf) {

       } else {
           IO.println(String.format(localeBr, "Impossível com o número de CPF informado: %s", clientCpf));
       }
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
    protected void printClients() {
        if (!clientsList.isEmpty()) {
            IO.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            IO.println("> Lista de Clientes <");
            clientsList
                    .forEach(c -> IO.println(c));
            IO.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            IO.println("Clientes não cadastrados, nada para mostrar.");
        }


    }
}
