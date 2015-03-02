package com.epishie.printservice.ui.executor;

import android.os.Handler;
import android.os.Looper;

import com.epishie.printservice.domain.executor.PostThreadExecutor;

public class MainThreadExecutor implements PostThreadExecutor {

    private final Handler mHandler;

    public MainThreadExecutor() {
        mHandler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void post(Runnable runnable) {
        mHandler.post(runnable);
    }
}
