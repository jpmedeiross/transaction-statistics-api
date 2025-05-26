package com.jpmdrs.transaction_statistics_api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionDto {

    @NotNull
    @Min(0)
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
