package com.epishie.printservice.ui.di.module;

import android.printservice.PrinterDiscoverySession;

import com.epishie.printservice.domain.executor.PostThreadExecutor;
import com.epishie.printservice.domain.executor.ThreadExecutor;
import com.epishie.printservice.ui.view.print.GenericPrinterDiscoverySession;

import dagger.Module;
import dagger.Provides;

@Module
public class PrintServiceApiModule {

    @Provides
    public PrinterDiscoverySession providePrinterDiscoverySession(ThreadExecutor threadExecutor, PostThreadExecutor postThreadExecutor) {
        return new GenericPrinterDiscoverySession(threadExecutor, postThreadExecutor);
    }
}
