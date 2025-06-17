package com.example.explorecalijpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.example.explorecalijpa.model.Difficulty;
import com.example.explorecalijpa.model.Tour;
import com.example.explorecalijpa.model.TourPackage;

public interface TourRepository extends JpaRepository<Tour, Integer> {
  List<Tour> findByDifficulty(Difficulty difficulty);
  List<Tour> findByTourPackageCode(String tourPackageCode);
}