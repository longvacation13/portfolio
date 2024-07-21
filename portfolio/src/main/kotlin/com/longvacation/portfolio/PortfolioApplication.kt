package com.longvacation.portfolio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PortfolioApplication

// 프로세스의 시작점
fun main(args: Array<String>) {
	runApplication<PortfolioApplication>(*args)
}
