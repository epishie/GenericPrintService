package com.epishie.printservice.ui.di.component;

import com.epishie.printservice.ui.di.module.PrintServiceApiModule;
import com.epishie.printservice.ui.di.scope.PrintServiceScope;
import com.epishie.printservice.ui.view.print.GenericPrintService;

import dagger.Component;

@PrintServiceScope
@Component(
        modules = PrintServiceApiModule.class,
        dependencies = SessionComponent.class
)
public interface PrintServiceApiComponent {
    void inject(GenericPrintService printService);
}
