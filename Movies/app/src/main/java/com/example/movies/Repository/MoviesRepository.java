package com.example.movies.Repository;

import android.app.Application;
import android.os.AsyncTask;

import com.example.movies.Dao.MoviesDao;
import com.example.movies.Database.MoviesDatabase;
import com.example.movies.model.Movies;

import java.util.List;

public class MoviesRepository {

    private MoviesDatabase moviesDatabase;

    public MoviesRepository(Application application)
    {
        moviesDatabase=MoviesDatabase.getINSTANCE(application);
    }

    public void insert(List<Movies> moviesList)
    {
        new InsertAsyncTask(moviesDatabase).execute(moviesList);
    }

    static class InsertAsyncTask extends AsyncTask<List<Movies>,Void,Void>
    {
        private MoviesDao moviesDao;

        private InsertAsyncTask(MoviesDatabase moviesDatabase)
        {
            moviesDao=moviesDatabase.moviesDao();

        }
        @Override
        protected Void doInBackground(List<Movies>... lists) {
            moviesDao.insert(lists[0]);
            return null;
        }
    }
}
