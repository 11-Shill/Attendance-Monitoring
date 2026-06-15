package com.dhiware.attendance_monitoring.service;

import com.dhiware.attendance_monitoring.entity.FaceData;
import com.dhiware.attendance_monitoring.repository.FaceDataRepository;
import org.springframework.stereotype.Service;

@Service
public class FaceDataService {

    private final FaceDataRepository faceDataRepository;

    public FaceDataService(FaceDataRepository faceDataRepository) {
        this.faceDataRepository = faceDataRepository;
    }

    public FaceData saveFaceData(FaceData faceData) {
        return faceDataRepository.save(faceData);
    }
    public java.util.List<FaceData> getAllFaceData() {
    return faceDataRepository.findAll();
}
}