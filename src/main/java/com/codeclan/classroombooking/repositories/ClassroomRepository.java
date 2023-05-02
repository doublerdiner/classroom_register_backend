package com.codeclan.classroombooking.repositories;

import com.codeclan.classroombooking.modules.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}