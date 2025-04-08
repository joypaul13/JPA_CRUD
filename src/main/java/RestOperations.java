import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RestOperations {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
		EntityManager  entityManager=factory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee=entityManager.find(Employee.class, 5);
		employee.setName("FromJPAUpadate");
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}
}
