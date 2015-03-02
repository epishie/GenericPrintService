package com.epishie.printservice.ui.view.print;

import android.printservice.PrintJob;
import android.printservice.PrintService;
import android.printservice.PrinterDiscoverySession;

import com.epishie.printservice.ui.Session;
import com.epishie.printservice.ui.di.component.Dagger_PrintServiceApiComponent;
import com.epishie.printservice.ui.di.component.PrintServiceApiComponent;

import javax.inject.Inject;
import javax.inject.Provider;

public class GenericPrintService extends PrintService {

    private PrintServiceApiComponent mComponent;
    @Inject protected Provider<PrinterDiscoverySession> mPrinterDiscoverySessionProvider;

    @Override
    public void onCreate() {
        super.onCreate();

        Session session = (Session)getApplication();
        mComponent = Dagger_PrintServiceApiComponent.builder()
                .sessionComponent(session.getComponent())
                .build();
        mComponent.inject(this);
    }

    @Override
    protected PrinterDiscoverySession onCreatePrinterDiscoverySession() {
        return mPrinterDiscoverySessionProvider.get();
    }

    @Override
    protected void onRequestCancelPrintJob(PrintJob printJob) {

    }

    @Override
    protected void onPrintJobQueued(PrintJob printJob) {

    }
}
