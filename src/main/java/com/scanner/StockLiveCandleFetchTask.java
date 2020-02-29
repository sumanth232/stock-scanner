package com.scanner;

import org.ta4j.core.*;

import java.time.Duration;

public class StockLiveCandleFetchTask implements Runnable {

    private String symbol;
    private Duration timePeriod;

    public StockLiveCandleFetchTask(String symbol, Duration timePeriod) {
        this.symbol = symbol;
        this.timePeriod = timePeriod;
    }

    @Override
    public void run() {

    }
}
