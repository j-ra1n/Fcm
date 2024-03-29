package com.example.fcm.fcm.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FcmSingleTokenRequest {

    private String token;             // 토큰 한개를 가져올 때

    private String title;            // 메시지의 제목

    private String message;          // 메시지

}
