package br.com.contafacil.shared.bonnarotec.toolslib.domain.utils;

import br.com.contafacil.shared.bonnarotec.toolslib.domain.client.ClientDTO;
import br.com.contafacil.shared.bonnarotec.toolslib.domain.user.UserDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import org.springframework.http.HttpHeaders;

@Component
public class Helpers {

    private final ObjectMapper objectMapper;

    public Helpers(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ClientDTO getClient(HttpHeaders headers) throws JsonMappingException, JsonProcessingException {
        @SuppressWarnings("null")
        String clientJSON = headers.get("X-Client").get(0);
        return objectMapper.readValue(clientJSON, ClientDTO.class);
    }

    public UserDTO getUser(HttpHeaders headers) throws JsonMappingException, JsonProcessingException {
        @SuppressWarnings("null")
        String userJSON = headers.get("X-User").get(0);
        return objectMapper.readValue(userJSON, UserDTO.class);
    }
}
