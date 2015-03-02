package com.epishie.printservice.ui.di.component;

import com.epishie.printservice.domain.executor.PostThreadExecutor;
import com.epishie.printservice.domain.executor.ThreadExecutor;
import com.epishie.printservice.ui.di.module.ExecutorModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                ExecutorModule.class
        }
)
public interface SessionComponent {
    ThreadExecutor getThreadExecutor();
    PostThreadExecutor getPostThreadExecutor();
}
