package ufpe.cin.gerenciamento.ComunicaçãoGeradorSenha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ComunicaçãoGeradorSenha implements InterfaceComunicaçãoGeradorSenha {

    public static final String URL = "https://random.justyy.workers.dev/api/random/?cached&n=18";

    @Override
    public String gerarSenha() throws Exception {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(URL).openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            if (connection.getResponseCode() != 200) {
                System.out.println("Erro " + connection.getResponseCode() + " ao obter dados da URL " + URL);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));

            String output = "";
            String line;
            while ((line = br.readLine()) != null) {
                output += line;
            }

            System.out.println(output);
            return output;

        } catch (IOException ex) {
            // Logger.getLogger(APIRest.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception("Não foi possível gerar uma senha");
        }
    }
}
