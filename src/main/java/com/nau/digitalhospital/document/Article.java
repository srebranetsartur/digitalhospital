package com.nau.digitalhospital.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Article {
    @Id
    private ObjectId ID;
    private String title;
    private String content;
    private List<String> tags;
}
