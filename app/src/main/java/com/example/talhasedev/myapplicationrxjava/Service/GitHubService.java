package com.example.talhasedev.myapplicationrxjava.Service;


import com.example.talhasedev.myapplicationrxjava.Model.GitHubRepo;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by TalhaSeDev on 16/02/2018.
 */

public interface GitHubService {
    @GET("users/{user}/starred")
    Observable<List<GitHubRepo>> getStarredRepositories(@Path("user") String userName);
}