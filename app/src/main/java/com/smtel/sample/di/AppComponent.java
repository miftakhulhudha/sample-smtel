package com.smtel.sample.di;

import dagger.Component;

@Component(modules = {CommonModule.class, ConnectionModule.class})
public interface AppComponent {
}
