package br.com.contafacil.shared.bonnarotec.toolslib.domain.utils;

import br.com.contafacil.shared.bonnarotec.toolslib.domain.client.ClientDTO;
import br.com.contafacil.shared.bonnarotec.toolslib.domain.user.UserDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Helpers {

    private final ObjectMapper objectMapper;

    public Helpers(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ClientDTO getClient(String headerValue) throws JsonMappingException, JsonProcessingException {
        if (headerValue == null) {
            throw new RuntimeException("X-Client header not found");
        }
        return objectMapper.readValue(headerValue, ClientDTO.class);
    }

    public UserDTO getUser(String headerValue) throws JsonMappingException, JsonProcessingException {
        if (headerValue == null) {
            throw new RuntimeException("X-User header not found");
        }
        return objectMapper.readValue(headerValue, UserDTO.class);
    }

    public String getHeaderValue(Map<String, String> headers, String headerName) {
        return headers.get(headerName);
    }
}