package com.example.movies.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

import com.example.movies.Dao.MoviesDao;
import com.example.movies.Database.MoviesDatabase;
import com.example.movies.model.Movies;

public class MoviesViewModel extends AndroidViewModel {

    private LiveData<PagedList<Movies>> pagedListLiveData;
    private MoviesDao moviesDao;

    public MoviesViewModel(@NonNull Application application) {
        super(application);
        moviesDao= MoviesDatabase.getINSTANCE(application).moviesDao();
        pagedListLiveData=new LivePagedListBuilder<>(
            moviesDao.getAllMovies(),5
        ).build();
    }
}
