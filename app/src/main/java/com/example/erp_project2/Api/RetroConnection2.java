package com.example.erp_project2.Api;

import retrofit2.Retrofit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetroConnection2 {


        private static Retrofit retrofit = null;

        public static Retrofit getRetrofitInstance() {
            if (retrofit == null) {
                OkHttpClient client = new OkHttpClient.Builder()
                        .connectTimeout(30, TimeUnit.SECONDS)
                        .writeTimeout(30, TimeUnit.SECONDS)
                        .readTimeout(30, TimeUnit.SECONDS)
                        .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                        .addInterceptor(new Interceptor() {
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request originalRequest = chain.request();
                                Request.Builder requestBuilder = originalRequest.newBuilder()
                                        .addHeader("Accept", "application/json")
                                        .addHeader("Authorization", "Bearer " +"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiI2NjQ2NDBhYzliYjViODYzNWQ3Zjg3MzIiLCJvcmdJZCI6IjY2MzdjYmJlOWJlMTBmOGQzODZiYWZiZiIsInVzZXJSb2xlIjoiY29uc3VtZXIiLCJpYXQiOjE3MTU4ODAzNTZ9.vY-14h2rNiEuamK24k1DVxE852y4Tmiu5R7irgwct6Q");

                                Request request = requestBuilder.build();
                                Response response = chain.proceed(request);
                                int statusCode = response.code(); // Capture status code if needed
                                return response;
                            }
                        })
                        .build();

                retrofit = new Retrofit.Builder()
                        .baseUrl("https://seated-booking.onrender.com/")
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(client)
                        .build();
            }
            return retrofit;
        }

        public static Api_Interface getApiService() {
            return getRetrofitInstance().create(Api_Interface.class);
        }


}
