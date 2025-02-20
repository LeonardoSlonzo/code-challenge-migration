package com.example.dummyjson;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DummyJsonClientApplication.class)
abstract class DummyJsonClientApplicationTest {

    @Test
    void contextLoads() {
    }
}
