package local.gespenst.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import local.gespenst.chucknorrisjokes.controllers.JokesChuckNorrisController;

@SpringBootApplication
public class ChuckNorrisJokesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ChuckNorrisJokesApplication.class, args);
		JokesChuckNorrisController jokesChuckNorrisController = (JokesChuckNorrisController) ctx.getBean("jokesChuckNorrisController");
		System.out.println("jokes : " + jokesChuckNorrisController.makeMeLaugh());
	}

}
