/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  info.movito.themoviedbapi.TmdbApi
 *  info.movito.themoviedbapi.model.core.popularperson.PopularPersonResultsPage
 *  info.movito.themoviedbapi.model.people.PersonDb
 *  info.movito.themoviedbapi.model.people.credits.CombinedPersonCredits
 *  info.movito.themoviedbapi.tools.TmdbException
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.model.core.popularperson.PopularPersonResultsPage;
import info.movito.themoviedbapi.model.people.PersonDb;
import info.movito.themoviedbapi.model.people.credits.CombinedPersonCredits;
import info.movito.themoviedbapi.tools.TmdbException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"person"})
public class PersonController {
    @Autowired
    private TmdbApi tmdbApi;

    @PostMapping(value={"{personId}"})
    public PersonDb getPersonDetails(@PathVariable int personId, @RequestParam String language) throws TmdbException {
        PersonDb personDb = this.tmdbApi.getPeople().getDetails(personId, language, null);
        return personDb;
    }

    @PostMapping(value={"getPeopleCombinedCredits"})
    public CombinedPersonCredits getPeopleCombinedCredits(@RequestParam int personId, @RequestParam String language) throws TmdbException {
        CombinedPersonCredits combinedPersonCredits = this.tmdbApi.getPeople().getCombinedCredits(personId, language);
        return combinedPersonCredits;
    }

    @PostMapping(value={"getPeoplePopular"})
    public PopularPersonResultsPage getPeoplePopular(@RequestParam String language, @RequestParam int page) throws TmdbException {
        PopularPersonResultsPage popularPersonResultsPage = this.tmdbApi.getPeopleLists().getPopular(language, Integer.valueOf(page));
        return popularPersonResultsPage;
    }

    @PostMapping(value={"getSearchPerson"})
    public PopularPersonResultsPage getSearchPerson(@RequestParam String query, @RequestParam Boolean includeAdult, @RequestParam String language, @RequestParam int page) throws TmdbException {
        PopularPersonResultsPage popularPersonResultsPage = this.tmdbApi.getSearch().searchPerson(query, includeAdult, language, Integer.valueOf(page));
        return popularPersonResultsPage;
    }
}