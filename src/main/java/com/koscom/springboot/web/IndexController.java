package com.koscom.springboot.web;

import com.koscom.springboot.config.auth.LoginUser;
import com.koscom.springboot.config.auth.dto.SessionUser;
import com.koscom.springboot.domain.user.User;
import com.koscom.springboot.service.PostsService;
import com.koscom.springboot.web.dto.posts.PostsResponseDto;
import com.koscom.springboot.web.dto.posts.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) { // (1)
        model.addAttribute("posts", postsService.findAllDesc());
        if (user != null) {
            model.addAttribute("user", user.getName());
        }
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }

}

