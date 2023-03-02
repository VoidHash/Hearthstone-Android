package com.voidhash.heartstone.framework.network

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object HearthstoneService {

    private const val BASE_URL = "https://omgvamp-hearthstone-v1.p.rapidapi.com/"

    private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        this.level = HttpLoggingInterceptor.Level.BODY
    }

    private val client: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .addInterceptor(Interceptor { chain ->
                val original: Request = chain.request()
                val request: Request = original.newBuilder()
                    .header("X-RapidAPI-Host", "omgvamp-hearthstone-v1.p.rapidapi.com")
                    .header("X-RapidAPI-Key", "3a6e3481d9mshf9421db4165c108p1b0d8ajsn8a3c10e596c3")
                    .method(original.method, original.body)
                    .build()
                chain.proceed(request)
            })
            .addInterceptor(interceptor)
            .connectTimeout(0, TimeUnit.SECONDS)
            .writeTimeout(0, TimeUnit.SECONDS)
            .readTimeout(0, TimeUnit.SECONDS)
            .build();
    }

    val request: HearthstoneAPI by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
            .create(HearthstoneAPI::class.java)
    }
}