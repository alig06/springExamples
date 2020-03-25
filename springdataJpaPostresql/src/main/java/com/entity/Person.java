package com.entity;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max.List;

import org.springframework.data.annotation.Id;

import com.entity.Address;

public class Person
{

    @Id
    @SequenceGenerator(name = "seq_person", allocationSize = 1)
    @GeneratedValue(generator = "seq_person", strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(length = 100, name = "Name")
    private String name;

    @Column(length = 100,name = "Surname")
    private String surname;

    @OneToMany
    @JoinColumn
    private List<Address> addressList;
}
