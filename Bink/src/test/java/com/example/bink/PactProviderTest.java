package com.example.bink;

import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.IgnoreMissingStateChange;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.StateChangeAction;
import au.com.dius.pact.provider.junitsupport.loader.PactBroker;
import au.com.dius.pact.provider.junitsupport.loader.PactFolder;
import com.example.bink.controller.BinkController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@PactFolder("src/main/java/com/example/bink/pacts")
@Provider("BinkService")
@PactBroker(url="http://localhost:9292")
public class PactProviderTest {

    @LocalServerPort
    Integer port;

    @Autowired
    BinkController binkController;

    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    public void pactVerificationTest(PactVerificationContext context) {
        context.verifyInteraction();
    }

    @BeforeEach
    public void setup(PactVerificationContext context)
    {
        context.setTarget(new HttpTestTarget("localhost",port));
    }

    @State(value= "loyalty cards overview",action= StateChangeAction.SETUP)
    public void coursesExist()
    {

    }

    @State(value= "loyalty cards overview",action= StateChangeAction.TEARDOWN)
    public void coursesExistTearDown()
    {

    }


}
