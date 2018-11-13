package ua.unifi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.unifi.entity.EducationEntity;

@Repository
public interface EducationRepository extends JpaRepository<EducationEntity, Long> {

}
