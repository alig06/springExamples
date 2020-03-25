package com;

import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserApi
{
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        HashMap<String, String> props = new HashMap<String, String>();
        props.put("cinsiyet","erkek");
        User user = new User();
        user.setName("ali");
        user.setSurname("göktaş");
        user.setProperties(props);
        userRepository.save(user);
    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List> listAll(){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
