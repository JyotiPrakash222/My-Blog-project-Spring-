package com.jpblog.myblog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {
  private final List<Myblog> blogs;

  public BlogController() {
    blogs = new ArrayList<>();
  }

  @GetMapping({ "/", "/blogs" })
  public String blogs(Model model) {
    model.addAttribute("blogs", blogs);
    return "blogs";
  }

  @GetMapping("/blog")
  public String blog(@RequestParam int id, Model model) {
    var blog = blogs.get(id);
    model.addAttribute("blog", blog);
    return "blog";
  }

  @GetMapping("/add-blog")
  public String addBlog() {
    return "add-blog";
  }

  @PostMapping("/add-blog")
  public String addBlog(@ModelAttribute Myblog blog) {
    blogs.add(blog);
    return "redirect:/blogs";
  }

  @GetMapping("/home")
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
    return "home";
  }

}