package edu.sokol.TvRanger.web;

import java.lang.System;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class Foo {

  @RequestMapping("/**")
  @ResponseBody
  public String foo() {
    return "This is foo method call!";
  }
}
