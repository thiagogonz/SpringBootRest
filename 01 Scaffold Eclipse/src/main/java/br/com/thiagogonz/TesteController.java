package br.com.thiagogonz;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
	private static final String texto = "Hello, %s!";
	
	private final AtomicLong contador = new AtomicLong();
	
	@RequestMapping("/teste")
	public Teste teste(@RequestParam(value="name", defaultValue="World") String name){
		return new Teste(contador.incrementAndGet(), String.format(texto, name));
	}
}
