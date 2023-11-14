package com.websocket.websocket.model;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Getter
@Setter


public class Message {

    private  String senderName;
    private  String receiverName;
    private Date date;
    private Status status;





}
