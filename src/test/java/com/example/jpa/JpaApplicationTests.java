package com.example.jpa;

import com.example.jpa.entity.User;
import org.junit.Assert;
import com.example.jpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class JpaApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(1);
    }

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByIdTest() {
        Optional optional = userRepository.findById("40289f0c65674a930165674d54940000");
        Assert.assertNotNull(optional.get());
    }

    @Test
    public void saveTest() {
        User user = new User();
        user.setEmail("zs@163.com");
        user.setPassword("123456");
        user.setUsername("zhaos");
        userRepository.save(user);
    }

}
