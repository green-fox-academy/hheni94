package com.hheni94.resttest;

import com.hheni94.resttest.controllers.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype());

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void translateMessage_testWithParameter() throws Exception {
    mockMvc.perform(get("/groot/?receivedMessage=somemessage")) //Itt mondom meg, hogy milyen paramétert adok meg.
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.received", is("somemessage")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void translateMessage_testWithoutParameter() throws Exception {
    mockMvc.perform(get("/groot"))
        .andDo(print()) //Ha ezt beleteszem, akkor kiírja hogy mi a hiba.
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void calculateSpeed_testWithParameters() throws Exception {
    mockMvc.perform(get("/yondu/?distance=100.0&time=10.0"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.distance", is(100.00)))
        .andExpect(jsonPath("$.time", is(10.0)))
        .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void calculateSpeed_testWithoutParameters() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andDo(print())
        .andExpect(status().isBadRequest());
  }
}
