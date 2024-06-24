package com.example.patents.ResponseModel;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Response {
    String responseCode;
    String responseMessage;
    Object data;
}
