package pl.dszerszen.app.ui.start.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import pl.dszerszen.app.ui.start.StartViewModel

val startModule = module {
    viewModel {
        StartViewModel()
    }
}