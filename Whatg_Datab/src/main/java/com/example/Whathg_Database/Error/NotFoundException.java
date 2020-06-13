package com.example.Whathg_Database.Error;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiBaseException {

   public NotFoundException(String message) {
       super(message);
   }

   @Override
   public HttpStatus getStatusCode() {
       return HttpStatus.NOT_FOUND;
   }
}