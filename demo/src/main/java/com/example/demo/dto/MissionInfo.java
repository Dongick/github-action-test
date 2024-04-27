package com.example.demo.dto;

import lombok.Data;

@Data
public class MissionInfo {
    private String id;
    private String username;
    private String creatorEmail;
    private String title;
    private String photoUrl;
    private int minParticipants;
    private int participants;
    private int duration;
    private String status;
    private String frequency;
}
