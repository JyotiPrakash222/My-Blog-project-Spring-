package com.jpblog.myblog;

import lombok.Data;
import lombok.Setter;

@Setter
@Data
public class blog {
  private String blogname;

  public blog() {
  }

  public blog(String blogname) {
    this.blogname = blogname;
  }
}
