package com.santander.program.santanderapp.controller.dto;


import com.santander.program.santanderapp.domain.model.History;

import java.math.BigDecimal;
import java.sql.Date;

public record HistoryDto(Long id, BigDecimal value, String userName, Date transactionDate, String description) {
    public HistoryDto(History model) {
        this(model.getId(), model.getValue(), model.getUserName(), model.getTransactionDate(), model.getDescription());
    }
    public History toModel(){
        History model = new History();
        model.setId(this.id);
        model.setValue(this.value);
        model.setUserName(this.userName);
        model.setTransactionDate(this.transactionDate);
        model.setDescription(this.description);
        return model;
    }
}
