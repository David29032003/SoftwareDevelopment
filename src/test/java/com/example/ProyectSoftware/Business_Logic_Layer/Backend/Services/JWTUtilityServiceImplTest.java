package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;

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
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class JWTUtilityServiceImplTest {

    @InjectMocks
    private JWTUtilityServiceImpl jwtUtilityService;

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
        // Mock the resource URIs
        when(privateKeyResource.getURI()).thenReturn(getClass().getResource("/jwtKeys/private_key.pem").toURI());
        when(publicKeyResource.getURI()).thenReturn(getClass().getResource("/jwtKeys/public_key.pem").toURI());

        // Generate JWT
        String jwt = jwtUtilityService.generateJWT(123);

        // Parse JWT
        JWTClaimsSet claimsSet = jwtUtilityService.parseJWT(jwt);

        // Verify
        assertEquals("123", claimsSet.getSubject());
    }

    @Test
    public void testLoadPublicKey() throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, URISyntaxException {
        // Mock the public key resource URI
        when(publicKeyResource.getURI()).thenReturn(getClass().getResource("/jwtKeys/public_key.pem").toURI());

        // Call the method under test
        PublicKey publicKey = jwtUtilityService.loadPublicKey(publicKeyResource);

        // Assert that the public key is not null
        assertEquals(true, publicKey != null);
        // You may add more assertions to validate the public key if needed
    }

    @Test
    public void testLoadPrivateKey() throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, URISyntaxException {
        // Mock the private key resource URI
        when(privateKeyResource.getURI()).thenReturn(getClass().getResource("/jwtKeys/private_key.pem").toURI());

        // Call the method under test
        PrivateKey privateKey = jwtUtilityService.loadPrivateKey(privateKeyResource);

        // Assert that the private key is not null
        assertEquals(true, privateKey != null);
        // You may add more assertions to validate the private key if needed
    }

}
