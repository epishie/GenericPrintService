package com.epishie.printservice.domain.interactor;

import com.epishie.printservice.domain.executor.PostThreadExecutor;
import com.epishie.printservice.domain.executor.ThreadExecutor;
import com.epishie.printservice.domain.provider.PrinterProvider;

public class FindPrintersUseCaseImpl implements FindPrintersUseCase {

    private final PrinterProvider mPrinterProvider;
    private final ThreadExecutor mThreadExecutor;
    private final PostThreadExecutor mPostThreadExecutor;

    private Callback mCallback;

    public FindPrintersUseCaseImpl(PrinterProvider printerProvider, ThreadExecutor threadExecutor, PostThreadExecutor postThreadExecutor) {
        mPrinterProvider = printerProvider;
        mThreadExecutor = threadExecutor;
        mPostThreadExecutor = postThreadExecutor;
    }

    @Override
    public void execute(Callback callback) {

    }

    @Override
    public void halt() {

    }
}
