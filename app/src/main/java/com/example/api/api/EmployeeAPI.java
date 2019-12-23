package com.example.api.api;

import com.example.api.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface EmployeeAPI {

    @GET("employees")
    Call<List<Employee>> getAllEmployees();

    //Get employee on basis of EmpID
    @GET("employee/{empID}")
    Call<Employee>getEmployeeByID(@Path("empID")int empID);
}
