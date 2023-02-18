package com.cicd.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {

	@GetMapping("/welcome")
	public  String welcome(){
		return "Welcome to the CI/CD";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}

//echo "# devopsbegin" >> README.md
//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/RAVINDULM/devopsbegin.git
//		git push -u origin main