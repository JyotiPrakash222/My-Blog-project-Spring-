package com.jpblog.myblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class blogController {

  @GetMapping({ "/", "/blogs" })
  public String blogs() {
    return "blogs";
  }

  @GetMapping({ "/blog" })
  public String blog(Model model) {
    var blog1 = new blog();
    var blog2 = new blog();
    var blog3 = new blog();
    blog1.setBlogname("Travel and Explore the world with us...");
    blog2.setBlogname("Embracing the journey, capturing the moments.");
    blog3.setBlogname("Adventure awaits where the path unfolds. 🗺️");
    model.addAttribute("blog", blog1);
    model.addAttribute("blog2", blog2); // Add the second blog to the model if needed
    model.addAttribute("blog3", blog3); // Add the second blog to the model if needed
    return "blog";
  }

  @GetMapping({ "/add-blog" })
  public String addBlog() {
    return "add-blog";
  }
}
