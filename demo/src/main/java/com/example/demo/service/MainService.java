package com.example.demo.service;

import com.example.demo.dto.MainResponse;
import com.example.demo.dto.MissionInfo;
import com.example.demo.repository.MissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {
    private final MissionRepository missionRepository;

    // 미션 목록을 보여주는 매서드
    @Transactional
    public MainResponse getInitialMissionList() {
        List<MissionInfo> participantMissionInfoList = null;

        List<MissionInfo> missionInfoList = getMissionList(0);

        MainResponse mainResponse = new MainResponse(participantMissionInfoList, missionInfoList);

        return mainResponse;
    }

    private List<MissionInfo> getMissionList(int num) {
        Pageable pageable = PageRequest.of(num, 20);

        return missionRepository.findAllByStatusNotOrderByCreatedAtDesc(pageable);
    }
}
