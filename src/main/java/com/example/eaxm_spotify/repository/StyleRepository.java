package com.example.eaxm_spotify.repository;

import com.example.eaxm_spotify.model.entity.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends JpaRepository<Style,Long> {
}
