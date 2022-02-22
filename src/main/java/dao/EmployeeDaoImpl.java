package dao;

import model.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {
    @PersistenceContext
    private EntityManager entityManager;



    @Override
    public List<Employee> getAllEmployees() {
        return entityManager.createQuery("select employee from Employee employee ", Employee.class).getResultList();
    }


}
