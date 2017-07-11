package com.bynry.btcl_employeeengagementapp.interfaces;

import com.android.volley.NetworkResponse;
import com.bynry.btcl_employeeengagementapp.webservices.JsonResponse;


public interface ServiceCaller {
    void onAsyncSuccess(JsonResponse jsonResponse, String label);
    void onAsyncFail(String message, String label, NetworkResponse response);
    void onAsyncCompletelyFail(String message, String label);
}
