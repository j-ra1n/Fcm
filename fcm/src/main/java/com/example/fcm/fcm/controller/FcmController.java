package com.example.fcm.fcm.controller;


import com.example.fcm.fcm.controller.request.FcmMultiTokenRequest;
import com.example.fcm.fcm.controller.request.FcmSingleTokenRequest;
import com.example.fcm.fcm.service.FcmService;
import com.google.firebase.messaging.FirebaseMessagingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/fcm")
public class FcmController {

    private final FcmService fcmService;


    /*
    백엔드에서 따로 메시지 확인방법이 없어서 확인하는 용도
     */
    @PostMapping("/single")
    public void sendMessageSingleDevice(@RequestBody FcmSingleTokenRequest token) throws FirebaseMessagingException {

        fcmService.sendMessageSingleDevice(token);
    }


    @PostMapping("/multi")
    public void sendMessageMultiDevice(@RequestBody FcmMultiTokenRequest token) throws FirebaseMessagingException {

        fcmService.sendMessageMultiDevice(token);
    }
}
