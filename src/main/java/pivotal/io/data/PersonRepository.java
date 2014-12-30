package pivotal.io.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {

	public Person findByFirstName(String firstName);
	
	public Person findByLastName( String lastName);
}
