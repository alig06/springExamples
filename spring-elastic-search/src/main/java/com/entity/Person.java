package com.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(indexName = "people",type = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person
{
    @Id
    private String id;

    @Field(name = "Name",type = FieldType.Text)
    private String name;

    @Field(name = "Surname",type = FieldType.Text)
    private String surname;

    @Field(name = "Address",type = FieldType.Text)
    private String address;

    @Field(name = "BornYear",type = FieldType.Date)
    private Date bornyear;
}
