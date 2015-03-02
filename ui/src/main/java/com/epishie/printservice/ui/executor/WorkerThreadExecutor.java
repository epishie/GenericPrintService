package com.epishie.printservice.ui.executor;

import com.epishie.printservice.domain.executor.ThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThreadExecutor implements ThreadExecutor {

    private final ExecutorService mExecutorService;

    public WorkerThreadExecutor() {
        mExecutorService = Executors.newFixedThreadPool(10);
    }

    @Override
    public void execute(Runnable runnable) {
        mExecutorService.execute(runnable);
    }
}
