package com.entity;

import java.io.Serializable;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "person_address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Address implements Serializable
{
    @Id
    @SequenceGenerator(name = "seq_name_address", allocationSize = 1)
    @GeneratedValue(generator = "seq_name_address", strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(length = 500, name = "Address")
    private String address;

    @Enumerated
    private AddressType addressType;
    private Boolean active;

    enum AddressType
    {
        HOME,
        WORK,
        OTHER
    }
}
