package br.com.javainsider.client.clientutils;

import java.util.Locale;

public final class ClientUtils {

    private final Locale localeBr = Locale.forLanguageTag("pt-BR");

    private ClientUtils(){}


    public static boolean checkingID(String clientID) {
       boolean isIDFormat = clientID.matches("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{1}");

       if (isIDFormat) {
           IO.println(String.format(Locale.forLanguageTag("pt-BR"), "Formato de identidade: %d -> válido.", clientID));
       } else {
           IO.println(String.format(Locale.forLanguageTag("pt-BR"), "Formato de indentidade: %s -> inválido.", clientID));
       }

       return isIDFormat;
    }

}
