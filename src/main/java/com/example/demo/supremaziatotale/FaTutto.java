package com.example.demo.supremaziatotale;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FaTutto {

    public List<PlanList> esegui () throws IOException, JSONException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/json.txt"));
        List<PlanList> odioViscomi = new ArrayList<PlanList>();
        String line = reader.readLine();
        while(line!=null) {
            PlanList odioTotale = new PlanList();
            JSONObject json = new JSONObject(line);
            JSONObject data = json.getJSONObject("result");
            odioTotale.setNome(data.getString("nome"));
            odioTotale.setTrial(data.getBoolean("trial"));
            odioTotale.setSubscriptionCyclicity(data.getString("subscriptionCyclicity"));
            odioTotale.setPaymentDueDate(new Date(data.getLong("paymentDueDate")));
            odioTotale.setPaymentDuePrice(data.getDouble("paymentDuePrice"));

            odioViscomi.add(odioTotale);
            line = reader.readLine();
        }
        return odioViscomi;
    }

    public void crea() throws FileNotFoundException {
        try {
            BufferedReader lista = new BufferedReader(new FileReader("src/main/resources/lista.txt"));
            BufferedReader body = new BufferedReader(new FileReader("src/main/resources/body.txt"));
            String nome = lista.readLine();
            String corpo = body.readLine();
            FileWriter myWriter = new FileWriter("src/main/resources/json.txt");
            while(nome!=null && corpo!=null) {
                corpo = corpo.replace("\"result\":{","\"result\":{\"nome\":\""+nome+"\",");
                myWriter.append(corpo);
                myWriter.append("\n");
                System.out.println(corpo);
                corpo = body.readLine();
                nome = lista.readLine();
            }
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
