package com.example.retrofitapp;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    BookRepository provideBookRepository(){
        return new BookRepository();
    }
}
