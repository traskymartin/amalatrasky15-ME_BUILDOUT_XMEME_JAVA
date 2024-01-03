package com.crio.starter.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "greetings")
@NoArgsConstructor
public class GreetingsEntity {

  private String extId;

  private String message;

  
  public String getExtId() {
    return extId;
  }

  public String getMessage() {
    return message;
  }

  public void setExtId(String extId) {
    this.extId = extId;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
