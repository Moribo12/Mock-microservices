package com.geeks4learning.UserManagement.ResponseObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObject<T> {

    private int statusCode;
    private String message;
    private T data;
}
