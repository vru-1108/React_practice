package com.indeed.server.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")

public class PostModel {
    private  String profile;
    private  String type;
    private String description;
    private  String technology[];
    private  String salary;
}
