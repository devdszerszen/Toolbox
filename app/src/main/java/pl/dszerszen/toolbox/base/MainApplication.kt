package pl.dszerszen.toolbox.base

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import pl.dszerszen.toolbox.koin.retrofitModule
import pl.dszerszen.toolbox.ui.start.di.startModule

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(listOf(retrofitModule, startModule))
        }
    }
}