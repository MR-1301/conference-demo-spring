package com.mahirspring.conferencedemo.repositories;

import com.mahirspring.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
