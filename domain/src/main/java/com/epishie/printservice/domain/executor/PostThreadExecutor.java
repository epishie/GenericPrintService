package com.epishie.printservice.domain.executor;

public interface PostThreadExecutor {

    void post(Runnable runnable);
}
