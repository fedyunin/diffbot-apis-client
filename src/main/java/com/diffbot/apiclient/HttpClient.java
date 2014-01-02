package com.diffbot.apiclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Alexey Fedyunin
 * @email alexey@cranfan.ru
 */
public class HttpClient {

    private StringBuffer request(String url, String method) throws Exception {

        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestMethod(method);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        in.close();

        return response;
    }

    public StringBuffer doGet(String url) throws Exception {
        return request(url, "GET");
    }
}
