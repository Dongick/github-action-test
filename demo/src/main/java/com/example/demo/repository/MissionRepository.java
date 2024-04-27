package com.example.demo.repository;

import com.example.demo.document.MissionDocument;
import com.example.demo.dto.MissionInfo;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MissionRepository extends MongoRepository<MissionDocument, ObjectId> {
    @Query(value= "{status: {$ne: 'COMPLETED'}}", sort = "{createdAt: -1}", fields="{id:1, username:1, creatorEmail:1, title:1, photoUrl:1, minParticipants:1, participants:1, duration:1, status:1, frequency:1}")
    List<MissionInfo> findAllByStatusNotOrderByCreatedAtDesc(Pageable pageable);
}
