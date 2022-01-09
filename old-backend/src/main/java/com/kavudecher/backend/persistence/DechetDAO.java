package com.kavudecher.backend.persistence;

import model.Dechet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DechetPersistance extends JpaRepository<Dechet, Long> {
}
