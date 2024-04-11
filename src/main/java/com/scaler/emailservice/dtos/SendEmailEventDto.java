package com.scaler.emailservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailEventDto {

    private String to;
    private String subject;
    private String body;
    private String from;

}
