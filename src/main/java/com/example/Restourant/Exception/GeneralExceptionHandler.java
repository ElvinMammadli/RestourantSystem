package com.example.Restourant.Exception;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GeneralExceptionHandler extends ResponseEntityExceptionHandler {

    private class JsonResponse {
        String message;
        int httpStatus ;
        String model;
        public JsonResponse() {
        }
        public JsonResponse(String message, int httpStatus ,String model) {
            super();
            this.model =model;
            this.message = message;
            this.httpStatus = httpStatus;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getHttpStatus() {
            return httpStatus;
        }

        public void setHttpStatus(int httpStatus) {
            this.httpStatus = httpStatus;
        }

    }

    @ExceptionHandler({ RuntimeException.class })
    public ResponseEntity<JsonResponse> handleRuntimeException(
            Exception ex, WebRequest request) {
        return new ResponseEntity<JsonResponse>(
                new JsonResponse(ex.getMessage(), 400 ,"USER"), new HttpHeaders(), HttpStatus.UNAUTHORIZED);
    }



}