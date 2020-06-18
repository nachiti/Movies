package com.example.movies.Dao;

import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.movies.model.Movies;

import java.util.List;

@Dao
public interface MoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<Movies> movies);

    @Query("DELETE FROM movies")
    void deleteAll();

    @Query("SELECT * FROM movies ORDER BY database_id ASC")
    DataSource.Factory<Integer,Movies> getAllMovies();

    
}
