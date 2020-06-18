package com.example.movies.model;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "movies", indices = @Index(value = "movies_id" ,unique = true))
public class Movies {

    @PrimaryKey(autoGenerate = true)
    private  int database_id;

    @SerializedName("id")
    private int movies_id;

    @SerializedName("title")
    private  String movies_name;

    @SerializedName("poster_path")
    private String movies_poster;

    @SerializedName("vote_average")
    private float movies_rating;

    private boolean isFavorite;

    public Movies(int movies_id, String movies_name, String movies_poster, float movies_rating) {
        this.movies_id = movies_id;
        this.movies_name = movies_name;
        this.movies_poster = movies_poster;
        this.movies_rating = movies_rating;
    }

    public int getMovies_id() {
        return movies_id;
    }

    public void setMovies_id(int movies_id) {
        this.movies_id = movies_id;
    }

    public String getMovies_name() {
        return movies_name;
    }

    public void setMovies_name(String movies_name) {
        this.movies_name = movies_name;
    }

    public String getMovies_poster() {
        return movies_poster;
    }

    public void setMovies_poster(String movies_poster) {
        this.movies_poster = movies_poster;
    }

    public float getMovies_rating() {
        return movies_rating;
    }

    public void setMovies_rating(float movies_rating) {
        this.movies_rating = movies_rating;
    }

    public int getDatabase_id() {
        return database_id;
    }
    public void setDatabase_id(int database_id) {
        this.database_id = database_id;
    }

    public boolean isFavorite() {
        return isFavorite;
    }
    public void setFavorite() {
        isFavorite = true;
    }
}
