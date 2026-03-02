package com.capgemini.basicspringboot;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeJpaRepository extends JpaRepository<Employee,Integer> {
    public Employee getByName(String name);
    //select * from emp where name=:name
    //getBy,findBy,readBy

    public Employee getBySalary(double salary);

    public Employee findByNameAndSalary(String name,double salary);

    @Modifying   // we are changing
    @Transactional   //since it is dml query
    @Query(value="update employee set salary=:newsalary where salary=:oldsalary",nativeQuery = true)
    public int updateBySalary(@Param("oldsalary") double oldsalary, @Param("newsalary") double newsalary);


}
