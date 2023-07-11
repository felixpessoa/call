package com.felixpessoa.call.dto;

import lombok.Data;

@Data
public class CallRequest {

    private String chamadaId;
    private String remetenteId;
    private String destinatarioId;
}
