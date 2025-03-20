package com.teste.teste.dto;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record ProductRecordDto(@NotNull String nmProduto, @NotNull BigDecimal vlProduto) {



}