package com.lamvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

    @GetMapping
    public String welcome() {
        return "Welcome to GitHub Cicd Actions Application";
    }
    public static void main(String[] args) {
        SpringApplication.run(GithubCicdActionsApplication.class, args);
    }
    echo "# github-actions-example" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/vtuyenlam1998/github-actions-example.git
    git push -u origin main
}
