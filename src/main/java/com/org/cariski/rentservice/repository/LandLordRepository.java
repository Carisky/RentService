package com.org.cariski.rentservice.repository;

import com.org.cariski.rentservice.model.LandLord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandLordRepository extends JpaRepository<LandLord, Long> {
}
