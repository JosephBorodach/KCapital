package com.KCapital.investments.tradingsystem.util.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.KCapital.investments.tradingsystem.util.gson.adapters.LocalDateAdapter;
import com.KCapital.investments.tradingsystem.util.gson.adapters.LocalTimeAdapter;
import com.KCapital.investments.tradingsystem.util.gson.adapters.ZonedDateTimeAdapter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

/**
 * {@link GsonUtil} contains utility methods relating to {@link Gson}.
 */
public class GsonUtil {

    /**
     * A {@link Gson} instance with registered date/time adapters.
     */
    public static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(ZonedDateTime.class, new ZonedDateTimeAdapter())
            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
            .registerTypeAdapter(LocalTime.class, new LocalTimeAdapter())
            .enableComplexMapKeySerialization()
            .setLenient()
            .create();
}
