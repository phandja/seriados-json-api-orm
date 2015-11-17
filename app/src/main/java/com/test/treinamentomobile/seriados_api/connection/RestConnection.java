package com.test.treinamentomobile.seriados_api.connection;

import com.test.treinamentomobile.seriados_api.model.ImageURL;
import com.test.treinamentomobile.seriados_api.model.TvShow;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

/**
 * Created by treinamentomobile on 11/17/15.
 */

@Rest(rootUrl = "http://api.tvmaze.com", converters = GsonHttpMessageConverter.class)
public interface RestConnection {
    @Get("/shows/{id}")
    TvShow getTvShowInfo(long id);

    @Get("/shows/{id}/cast")
    TvShow getTvShowCast(long id);

    @Get("/shows/{id}/episodes")
    TvShow getTvShowEpisodes(long id);

}