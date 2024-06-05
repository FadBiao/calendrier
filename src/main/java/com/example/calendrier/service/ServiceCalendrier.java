package com.example.calendrier.service;

import com.example.calendrier.entity.Calendrier;
import com.example.calendrier.repository.RepoCalendrier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service

public class ServiceCalendrier {

    @Autowired
    private RepoCalendrier repoCalendrier;

    public List<Calendrier> findAll() {
        return repoCalendrier.findAll();
    }

    public Optional<Calendrier> findById_Calendrier(Integer id) {
        return repoCalendrier.findById(id);
    }

    public List<Calendrier> findBySitesId (Integer sitesId) {
        return repoCalendrier.findBySitesId(sitesId);
    }


    public List<Calendrier> findByDate(Date date) {
        return repoCalendrier.findByDate(date);
    }


    public String createCalendrier(Calendrier calendrier) {
        repoCalendrier.save(calendrier);
        return "Success";
    }

    public String updateCalendrier(Calendrier calendrier) {
        repoCalendrier.save(calendrier);
        return "Success";
    }
    public void deleteById(Integer id) {
        repoCalendrier.deleteById(id);
    }



    public List<Calendrier> findBySportId (Integer sportId) {
        return repoCalendrier.findBySportId(sportId);
    }


    public Optional<Calendrier> findBySportIdAndDate(Integer sport_id, Date date) {
        return repoCalendrier.findBySportIdAndDate(sport_id, date);
    }
}
