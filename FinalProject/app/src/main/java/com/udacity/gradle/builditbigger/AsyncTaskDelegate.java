package com.udacity.gradle.builditbigger;

import android.support.v4.content.Loader;

/***************************************************************************************
 *    Title: AsyncTaskDelegate.java
 *    Author: dhiegoabrantes
 *    Date: Aug 3, 2016
 *    Code version: 1.0
 *    Availability: https://gist.github.com/dhiegoabrantes/7933078edf4ccb05f2de2bf3fca17ed0
 ***************************************************************************************/

@SuppressWarnings("ALL")
public interface AsyncTaskDelegate<T> {
    void processFinish(T output, Loader<T> callerLoader);
}
