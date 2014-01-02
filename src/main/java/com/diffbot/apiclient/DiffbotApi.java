package com.diffbot.apiclient;

import com.diffbot.apiclient.model.ArticleResponse;

/**
 * Diffbot API (diffbot.com)
 *
 * @author Alexey Fedyunin
 * @email alexey@cranfan.ru
 */
public interface DiffbotApi {

    public static final String URL = "http://api.diffbot.com/v2/";

    public ArticleResponse article(String token, String articleUrl) throws Exception;
}
