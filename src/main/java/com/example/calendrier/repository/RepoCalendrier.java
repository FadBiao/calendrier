package com.example.calendrier.repository;

import com.example.calendrier.entity.Calendrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface RepoCalendrier extends JpaRepository<Calendrier, Integer> {
    Optional<Calendrier> findById(Integer id);
    List<Calendrier> findByDate(Date date);

    List<Calendrier> findBySportId(Integer sportId);

    List<Calendrier> findBySitesId(Integer sitesId);

    Optional<Calendrier> findBySportIdAndDate(Integer sportId, Date date);


}
