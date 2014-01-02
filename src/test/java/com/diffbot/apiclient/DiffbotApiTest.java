package com.diffbot.apiclient;

import com.diffbot.apiclient.model.ArticleResponse;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Alexey Fedyunin
 * @email alexey@cranfan.ru
 */
public class DiffbotApiTest {

    private DiffbotApiImpl api;
    private String token;

    @Before
    public void setUp() throws Exception {
        this.api = new DiffbotApiImpl();
        this.token = "1acca39836967fbf13bfa6879d408ae5";

    }

    @Test
    public void testArticle() throws Exception {
        ArticleResponse result = api.article(token, "http://test.com");
        assertNotNull(result);
        assertEquals("Manage your tests and certifications with Test.com", result.getTitle());
        assertEquals("Welcome to test.com, where your organization can easily and quickly author and administer " +
                "training content, tests, and certifications online – with no complex technical requirements! If you " +
                "need to create a quiz or launch a certificate course for thousands of employees, " +
                "this software takes away the headache and brings everything together into one system customized for " +
                "you.", result.getText());
    }
}
