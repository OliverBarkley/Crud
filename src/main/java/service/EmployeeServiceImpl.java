//package service;
//
//import dao.EmployeeDaoImpl;
//import model.Employee;
//import org.springframework.stereotype.Repository;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//
//@Repository
//public class EmployeeServiceImpl implements EmployeeService {
//    private final EmployeeDaoImpl employeeDaoImpl;
//
//    public EmployeeServiceImpl(EmployeeDaoImpl employeeDaoImpl) {
//        this.employeeDaoImpl = employeeDaoImpl;
//    }
//
//    @Override
//    public void save(Employee employee) {
//    employeeDaoImpl.save(employee);
//
//    }
//
//    @Override
//    public void delete(Employee employee) {
//
//    }
//
//    @Override
//    public void delete(int id) {
//      employeeDaoImpl.delete(id);
//    }
//   @Transactional
//    @Override
//    public List<Employee> getAll() {
//
//        return employeeDaoImpl.getAll();
//    }
//    @Transactional
//    @Override
//    public Employee getById(int id) {
//        if (id != 0) {
//            return employeeDaoImpl.getById(id);
//        }
//        return null;
//    }
//
//@Transactional
//    @Override
//    public void update(int id, Employee employeeNew) {
//        if (id != 0) {
//            employeeDaoImpl.update(id,employeeNew);
//        }
//    }
//}