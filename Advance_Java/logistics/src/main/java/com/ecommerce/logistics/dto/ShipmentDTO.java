package com.ecommerce.logistics.dto;

import com.ecommerce.logistics.entity.Status;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShipmentDTO {
    @NotNull
    @Size(min=3,max=50)
    private String trackingNumber;

    @Email
    private String customerEmail;

    @NotNull
    private Status status;

    @NotNull
    private Long warehouseId;

}
