package com.example.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class MainResponse {
    private final List<MissionInfo> participantMissionInfoList;
    private final List<MissionInfo> missionInfoList;

    public MainResponse(List<MissionInfo> participantMissionInfoList, List<MissionInfo> missionInfoList) {
        this.participantMissionInfoList = participantMissionInfoList;
        this.missionInfoList = missionInfoList;
    }
}
