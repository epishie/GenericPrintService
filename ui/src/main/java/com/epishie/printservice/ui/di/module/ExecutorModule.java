package com.epishie.printservice.ui.di.module;

import com.epishie.printservice.domain.executor.PostThreadExecutor;
import com.epishie.printservice.domain.executor.ThreadExecutor;
import com.epishie.printservice.ui.executor.MainThreadExecutor;
import com.epishie.printservice.ui.executor.WorkerThreadExecutor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ExecutorModule {

    @Provides
    @Singleton
    public ThreadExecutor provideThreadExecutor() {
        return new WorkerThreadExecutor();
    }

    @Provides
    @Singleton
    public PostThreadExecutor providePostThreadExecutor() {
        return new MainThreadExecutor();
    }
}
