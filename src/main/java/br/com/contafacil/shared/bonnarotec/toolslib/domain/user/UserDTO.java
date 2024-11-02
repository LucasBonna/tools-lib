package br.com.contafacil.shared.bonnarotec.toolslib.domain.user;

import br.com.contafacil.shared.bonnarotec.toolslib.domain.client.ClientEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private UUID id;

    private String username;

    private String password;

    private String apiKey;

    private ClientEntity client;

}
