package dev.bhargav.banksecurity.dto;

import lombok.Data;

@Data
public class KycDto {

    private String name;

    private String address;

    private Long number;

    private String identityProof;
}
