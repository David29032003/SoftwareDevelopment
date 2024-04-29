package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.TestJWTUtilityServiceImplement;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.JWTUtilityServiceImplement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.io.Resource;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class testLoadPrivateKey {

    @InjectMocks
    private JWTUtilityServiceImplement jwtUtilityService;

    @Mock
    private Resource privateKeyResource;

    @Mock
    private Resource publicKeyResource;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLoadPrivateKey() throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, URISyntaxException {
        //Mock the private key resource URI
        when(privateKeyResource.getURI()).thenReturn(getClass().getResource("/jwtKeys/private_key.pem").toURI());

        //Call the method under test
        PrivateKey privateKey = jwtUtilityService.loadPrivateKey(privateKeyResource);

        //Assert that the private key is not null
        assertEquals(true, privateKey != null);
    }

}
