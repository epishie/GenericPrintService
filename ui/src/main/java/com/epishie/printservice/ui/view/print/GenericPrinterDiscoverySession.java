package com.epishie.printservice.ui.view.print;

import android.print.PrinterId;
import android.printservice.PrinterDiscoverySession;

import com.epishie.printservice.domain.executor.PostThreadExecutor;
import com.epishie.printservice.domain.executor.ThreadExecutor;

import java.util.List;

import javax.inject.Inject;

public class GenericPrinterDiscoverySession extends PrinterDiscoverySession {

    @Inject
    public GenericPrinterDiscoverySession(ThreadExecutor threadExecutor, PostThreadExecutor postThreadExecutor) {

    }

    @Override
    public void onStartPrinterDiscovery(List<PrinterId> priorityList) {

    }

    @Override
    public void onStopPrinterDiscovery() {

    }

    @Override
    public void onValidatePrinters(List<PrinterId> printerIds) {

    }

    @Override
    public void onStartPrinterStateTracking(PrinterId printerId) {

    }

    @Override
    public void onStopPrinterStateTracking(PrinterId printerId) {

    }

    @Override
    public void onDestroy() {

    }
}
