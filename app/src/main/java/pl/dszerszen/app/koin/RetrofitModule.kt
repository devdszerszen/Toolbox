package pl.dszerszen.app.koin

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import org.koin.dsl.module
import pl.dszerszen.app.constants.Constants
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val retrofitModule = module {

    single { createOkHttp() }

    single { createRetrofit(Constants.BASE_URL) }
}

private fun createOkHttp() = OkHttpClient.Builder().build()

private fun createRetrofit(baseUrl: String) = Retrofit.Builder()
    .callFactory(createOkHttp())
    .baseUrl(baseUrl)
    .addConverterFactory(MoshiConverterFactory.create())
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .build()