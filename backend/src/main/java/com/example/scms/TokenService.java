
package com.example.scms;

import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class TokenService {
    public String issueDemoToken(String username){
        return username + ":" + UUID.randomUUID();
    }
}
