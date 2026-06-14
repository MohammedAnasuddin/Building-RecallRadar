package com.recallradar.exception;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.recallradar.dto.ErrorResponseDTO;

@RestControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(MethodArgumentNotValidException.class) // thrown when @Valid fails

        public ResponseEntity<ErrorResponse> handleValidationException(
                        MethodArgumentNotValidException ex) {

                List<String> errors = ex.getBindingResult()
                                .getFieldErrors()
                                .stream()
                                .map(error -> error.getDefaultMessage())
                                .collect(Collectors.toList());

                ErrorResponse response = new ErrorResponse(
                                "Validation Failed",
                                errors);

                return ResponseEntity
                                .status(HttpStatus.BAD_REQUEST)
                                .body(response);
        }

        @ExceptionHandler(TopicNotFoundException.class)
        public ResponseEntity<ErrorResponseDTO> handleTopicNotFound(TopicNotFoundException ex) {
                ErrorResponseDTO error_dto = new ErrorResponseDTO();
                error_dto.setSuccess(false);
                error_dto.setStatus(HttpStatus.NOT_FOUND.value());
                error_dto.setMessage(ex.getMessage());
                error_dto.setTimestamp(LocalDateTime.now());

                return ResponseEntity
                                .status(HttpStatus.NOT_FOUND)
                                .body(error_dto);

        }
}