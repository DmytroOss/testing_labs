package com.example.lab4.model;/*
  @author   user
  @project   lab4
  @class  EntityDeleteRequest
  @version  1.0.0 
  @since 27.03.2024 - 22.49
*/

import java.time.LocalDateTime;

public record EntityDeleteRequest(String id, String name,String code, String description) {
}
