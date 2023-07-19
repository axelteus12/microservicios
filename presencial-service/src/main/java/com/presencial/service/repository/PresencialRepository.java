package com.presencial.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.presencial.service.entity.Presencial;

@Repository
public interface PresencialRepository extends JpaRepository<Presencial, Integer>{

	List<Presencial> findByUniversidadId(int universidadId);
}
