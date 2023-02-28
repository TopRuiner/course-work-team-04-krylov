package com.polyclinic.mis.repository;

import com.polyclinic.mis.models.Analysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalysisRepository extends JpaRepository<Analysis,Long> {
}
