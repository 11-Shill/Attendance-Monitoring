package com.dhiware.attendance_monitoring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhiware.attendance_monitoring.entity.FaceData;
import com.dhiware.attendance_monitoring.service.FaceDataService;

@RestController
@RequestMapping("/face-data")
@CrossOrigin("*")
public class FaceDataController {

    private final FaceDataService faceDataService;

    public FaceDataController(FaceDataService faceDataService) {
        this.faceDataService = faceDataService;
    }

    @GetMapping
    public List<FaceData> getAllFaceData() {
        return faceDataService.getAllFaceData();
    }

    @PostMapping
    public FaceData saveFaceData(@RequestBody FaceData faceData) {
        return faceDataService.saveFaceData(faceData);
    }
}