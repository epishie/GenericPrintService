package com.epishie.printservice.domain.interactor;

import com.epishie.printservice.domain.model.Printer;

public interface FindPrintersUseCase {

    void execute(Callback callback);
    void halt();

    interface Callback {
        void onFoundPrinter(Printer printer);
        void onError(Exception exception);
    }
}
