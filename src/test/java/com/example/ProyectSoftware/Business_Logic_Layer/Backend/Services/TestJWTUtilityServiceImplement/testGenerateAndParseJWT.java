package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.TestJWTUtilityServiceImplement;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.JWTUtilityServiceImplement;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jwt.JWTClaimsSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class testGenerateAndParseJWT {
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
    public void testGenerateAndParseJWT() throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, JOSEException, URISyntaxException, ParseException {
        //Mock the resource URIs
        when(privateKeyResource.getURI()).thenReturn(getClass().getResource("/jwtKeys/private_key.pem").toURI());
        when(publicKeyResource.getURI()).thenReturn(getClass().getResource("/jwtKeys/public_key.pem").toURI());

        //Generate JWT
        String jwt = jwtUtilityService.generateJWT(123);

        //Parse JWT
        JWTClaimsSet claimsSet = jwtUtilityService.parseJWT(jwt);

        //Verify
        assertEquals("123", claimsSet.getSubject());
    }
}
