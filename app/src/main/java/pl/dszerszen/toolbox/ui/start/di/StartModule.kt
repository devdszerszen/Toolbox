package pl.dszerszen.toolbox.ui.start.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import pl.dszerszen.toolbox.ui.start.StartViewModel

val startModule = module {
    viewModel {
        StartViewModel()
    }
}