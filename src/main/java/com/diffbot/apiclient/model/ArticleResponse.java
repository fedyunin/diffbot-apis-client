package com.diffbot.apiclient.model;

/**
 * @author Alexey Fedyunin
 * @email alexey@cranfan.ru
 */
public class ArticleResponse {

    private String url;

    private String resolved_url;

    private String icon;

    private String title;

    private String text;

    private String author;

    // TODO implement all fields from response


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResolved_url() {
        return resolved_url;
    }

    public void setResolved_url(String resolved_url) {
        this.resolved_url = resolved_url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
