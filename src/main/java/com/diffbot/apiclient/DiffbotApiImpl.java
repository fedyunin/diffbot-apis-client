package com.diffbot.apiclient;

import com.diffbot.apiclient.model.ArticleResponse;
import com.google.gson.Gson;

/**
 * @author Alexey Fedyunin
 * @email alexey@cranfan.ru
 */
public class DiffbotApiImpl implements DiffbotApi {


    private final HttpClient httpClient;

    public DiffbotApiImpl() {
        this.httpClient = new HttpClient();
    }

    @Override
    public ArticleResponse article(String token, String articleUrl) throws Exception {
        String url = String.format(URL + "/article?token=%s&url=%s", token, articleUrl);
        StringBuffer responseJson = httpClient.doGet(url);
        Gson gson = new Gson();
        return gson.fromJson(responseJson.toString(), ArticleResponse.class);
    }
}
