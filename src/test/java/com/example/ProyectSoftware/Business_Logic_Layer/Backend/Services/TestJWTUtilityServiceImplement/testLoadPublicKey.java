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
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class testLoadPublicKey {

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
    public void testLoadPublicKey() throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, URISyntaxException {
        //Mock the public key resource URI
        when(publicKeyResource.getURI()).thenReturn(getClass().getResource("/jwtKeys/public_key.pem").toURI());

        //Call the method under test
        PublicKey publicKey = jwtUtilityService.loadPublicKey(publicKeyResource);

        //Assert that the public key is not null
        assertEquals(true, publicKey != null);
    }
}
