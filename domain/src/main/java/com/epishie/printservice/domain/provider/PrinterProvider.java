package com.epishie.printservice.domain.provider;

import com.epishie.printservice.domain.model.Printer;

public interface PrinterProvider {

    void startDiscovery();
    void stopDiscovery();

    interface DiscoveryCallback {
        void onDiscoveredPrinter(Printer printer);
        void onException();
    }
}
