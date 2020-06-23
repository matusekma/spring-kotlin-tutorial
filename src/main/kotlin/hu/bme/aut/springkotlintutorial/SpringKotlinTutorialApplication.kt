package hu.bme.aut.springkotlintutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class SpringKotlinTutorialApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinTutorialApplication>(*args)
}
