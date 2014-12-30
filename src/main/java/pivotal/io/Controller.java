package pivotal.io;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pivotal.io.data.Person;
import pivotal.io.data.PersonRepository;

@RestController
//@RequestMapping("/CloudFoundrySample")
public class Controller {

	@Autowired
	PersonRepository repository;
	
	@Autowired
	private Environment env;
	
	
	@RequestMapping("/sayHello")
	public String sayHello() {
		Person p = new Person("Joseph", "Cordina");
		repository.save(p);
		
		
		return "Hello No "+p.id+ "---"+env.getProperty("VCAP_SERVICES");
	}
	
	@RequestMapping("/")
	public String sayYoYo() {
		Iterable<Person> allPersons = repository.findAll();
		StringBuilder sb = new StringBuilder();
		for (Person person: allPersons) {
			sb.append(person.toString()+"<br>");
		}
		
		return sb.toString();
	}
}
