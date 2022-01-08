package di

import com.ciandt.cardmanager.interceptor.LogInterceptor
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import service.teacher.TeacherService

val apiModule = module {
    single(named(RETROFIT)) {
        retrofit2.Retrofit.Builder()
            .client(get(named(OKHTTPCLIENT)))
            .baseUrl(BASE_URL)
            .addConverterFactory(
                MoshiConverterFactory.create(
                    get(named(MOSHI))
                )
            )
            .build()
    }

    single(named(MOSHI)) {
        Moshi.Builder().build()
    }

    single(named(OKHTTPCLIENT)) {
        OkHttpClient()
            .newBuilder()
            .addInterceptor(LogInterceptor())
            .build()
    }

    single<TeacherService> {
        get<Retrofit>(named(RETROFIT)).create(TeacherService::class.java)
    }

}

private const val RETROFIT = "retrofit"
private const val MOSHI = "moshi"
private const val BASE_URL = "https://api.github.com/"
private const val OKHTTPCLIENT = "okHttpClient"