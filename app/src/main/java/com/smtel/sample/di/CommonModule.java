package com.smtel.sample.di;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {

    @Provides
    @Singleton
    public ObjectMapper mapper() {
        return new ObjectMapper();
    }

}
