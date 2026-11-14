package br.com.javainsider.client.clientutils;

import java.util.Locale;

public final class ClientUtils {

    private static Locale localeBr = Locale.forLanguageTag("pt-BR");

    private ClientUtils(){}


    private static boolean checkingID(String clientID) {
       boolean isIDFormat = clientID.matches("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{1}");

       if (isIDFormat) {
           IO.println("----------------------------------------------");
           IO.println(String.format(Locale.forLanguageTag("pt-BR"), "Formato de identidade: %s -> válido.", clientID));
           IO.println("----------------------------------------------");
       } else {
           IO.println("----------------------------------------------");
           IO.println(String.format(Locale.forLanguageTag("pt-BR"), "Formato de indentidade: %s -> inválido.", clientID));
           IO.println("----------------------------------------------");
       }

       return isIDFormat;
    }

    private static boolean checkingCPF(String clientCpf) {

       boolean isFormatcpf = clientCpf.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}");
        if (isFormatcpf) {
            IO.println("----------------------------------------------");
            IO.println(String.format(Locale.forLanguageTag("pt-BR"), "Formato de CPF: %s -> válido.", clientCpf));
            IO.println("----------------------------------------------");
        } else {
            IO.println("----------------------------------------------");
            IO.println(String.format(Locale.forLanguageTag("pt-BR"), "Formato de CPF: %s -> inválido.", clientCpf));
            IO.println("----------------------------------------------");
        }

        return isFormatcpf;
    }

    private static boolean checkingCep(String cepStreet) {
        boolean isformartCep = cepStreet.matches("[0-9]{2}\\.[0-9]{3}-[0-9]{3}");

        if (isformartCep) {
            IO.println("----------------------------------------------");
            IO.println(String.format(Locale.forLanguageTag("pt-BR"), "Formato de CEP: %s -> válido.", cepStreet));
            IO.println("----------------------------------------------");
        } else {
            IO.println("----------------------------------------------");
            IO.println(String.format(Locale.forLanguageTag("pt-BR"), "Formato de CEP: %s -> inválido.", cepStreet));
            IO.println("----------------------------------------------");
        }

        return isformartCep;
    }

    public static boolean checkingAll(String clientID, String checkingCpf, String clientCep) {
        boolean localCheckingAll;

        if (checkingID(clientID) && checkingCPF(checkingCpf) && checkingCep(clientCep)) {
            localCheckingAll = true;

        } else {
            localCheckingAll = false;
            IO.println("---------------------------------------------------------------");
            IO.println("Verifique o formato dos documentos ou o formato do telefone.\n\n" +
                    "FORMATOS ACEITOS:\n\n" +
                    "Identidade formato: xx.xxx.xxx-x\n" +
                    "CPF formato: xxx.xxx.xxx-xx\n" +
                    "CEP formato:xx.xxx-xxx");
            IO.println("---------------------------------------------------------------");
        }

        return localCheckingAll;
    }

}
