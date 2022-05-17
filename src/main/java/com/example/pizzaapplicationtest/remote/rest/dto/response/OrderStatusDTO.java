package com.example.pizzaapplicationtest.remote.rest.dto.response;

import com.example.pizzaapplicationtest.domain.model.StatusType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class OrderStatusDTO {
    private StatusType status;
    @DateTimeFormat(pattern = "dd-mm-YYYY")
    private Date createdAt;
    @DateTimeFormat(pattern = "dd-mm-YYYY")
    private Date updatedAt;
    @DateTimeFormat(pattern = "dd-mm-YYYY")
    private Date expectedAt;

    public OrderStatusDTO() {

    }

    public OrderStatusDTO(StatusType status, Date createdAt, Date updatedAt, Date expectedAt) {
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expectedAt = expectedAt;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }
}
