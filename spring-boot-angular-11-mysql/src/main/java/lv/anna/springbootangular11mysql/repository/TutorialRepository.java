package lv.anna.springbootangular11mysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lv.anna.springbootangular11mysql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}


