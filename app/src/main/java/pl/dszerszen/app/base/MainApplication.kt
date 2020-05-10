package pl.dszerszen.app.base

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import pl.dszerszen.app.koin.retrofitModule
import pl.dszerszen.app.ui.start.di.startModule

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