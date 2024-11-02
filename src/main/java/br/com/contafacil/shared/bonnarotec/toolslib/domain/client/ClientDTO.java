package br.com.contafacil.shared.bonnarotec.toolslib.domain.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    private UUID id;

    private String name;

}
