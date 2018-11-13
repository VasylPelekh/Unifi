package ua.unifi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.unifi.entity.AdressEntity;

@Repository
public interface AdressRepository extends JpaRepository<AdressEntity, Long> {

}
