package com.beedigital.beestore.bdd;

import com.beedigital.beestore.BeeStoreApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@CucumberContextConfiguration
@SpringBootTest(classes = BeeStoreApplication.class)
@ActiveProfiles("test")
public class CucumberSpringConfiguration {
}