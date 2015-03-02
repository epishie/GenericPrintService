package com.epishie.printservice.domain.executor;

public interface ThreadExecutor {

    void execute(Runnable runnable);
}
