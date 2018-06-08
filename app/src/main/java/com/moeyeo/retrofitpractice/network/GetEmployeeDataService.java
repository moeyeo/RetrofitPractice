package com.moeyeo.retrofitpractice.network;

import com.moeyeo.retrofitpractice.model.Employee;
import com.moeyeo.retrofitpractice.model.EmployeeList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetEmployeeDataService {
    @GET("retrofit-demo.php")
    Call<EmployeeList> getEmployeeData(@Query("company_no") int companyNo);
}