package com.fstyle.androidtrainning.data.source;

public interface BaseLocalDataSource {
    void openTransaction();

    void closeTransaction();

    void openReadTransaction();
}
