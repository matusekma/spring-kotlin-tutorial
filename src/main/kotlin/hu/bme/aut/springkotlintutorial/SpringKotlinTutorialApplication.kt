package hu.bme.aut.springkotlintutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinTutorialApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinTutorialApplication>(*args)
}
