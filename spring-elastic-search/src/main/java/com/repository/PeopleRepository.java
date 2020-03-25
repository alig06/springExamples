package com.repository;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.entity.Person;

@Repository
public interface PeopleRepository extends ElasticsearchRepository<Person,String>
{
    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"name\" : \"?0\"}}}}")
    List<Person> getByCustomQuery();

    List<Person> findByNameLikeOrSurnameLike(String name,String surname);

}