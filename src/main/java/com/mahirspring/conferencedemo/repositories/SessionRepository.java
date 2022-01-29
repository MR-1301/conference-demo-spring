package com.mahirspring.conferencedemo.repositories;

import com.mahirspring.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
