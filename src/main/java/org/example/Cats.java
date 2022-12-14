package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {

    private String id;
    private String text;
    private String type;
    private String user;
    private Object upvotes;

    public Cats(@JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") Object upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public Cats() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Object getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Object upvotes) {
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "Cats{" + "\n" +
                "id: " + id + "\n" +
                "text: " + text + "\n" +
                "type: " + type + "\n" +
                "user: " + user + "\n" +
                "upvotes: " + upvotes + '}';
    }
}
