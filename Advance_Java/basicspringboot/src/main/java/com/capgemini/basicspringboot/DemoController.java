package com.capgemini.basicspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DemoController {
    @Autowired
    EmployeeJpaRepository jpa;//null //jpa
    @GetMapping("/a")
   // @ResponseBody //only the response the data not the html file
    public String getHi(){
        return "Hi";
    }

    @GetMapping("/b/{name}/{id}")
    //http://localhost:8080/b/Allen/10
    public String sendData(@PathVariable String name,@PathVariable String id){
        System.out.println(name);
        System.out.println(id);
        return "Success";
    }


    @PostMapping("/emp")
    public String createEmployee(@RequestBody Employee e){
//        System.out.println(e.getId());
//        System.out.println(e.getName());
//        System.out.println(e.getSalary());

        jpa.save(e);
        return "Success";
    }

    @GetMapping("/get-id/{id}")
    public Employee getById(@PathVariable int id){
        Optional<Employee> emp=jpa.findById(id);
        if(emp.isPresent()){
            return emp.get();
        }
        else{
            return null;
        }
    }

    @GetMapping("/get-all")
    public List<Employee> getAllEmployee(){
        List<Employee>res=jpa.findAll();
        return res;
    }

    @PutMapping("/update-id/{id}")
    public String updateEmployee(@PathVariable int id,@RequestBody Employee e){
        Employee employee=getById(id);
        employee.setId(e.getId());
        employee.setName(e.getName());
        employee.setSalary(e.getSalary());
        jpa.save(employee);
        return "Data Updated";

    }

    @PatchMapping("/update-field/{id}")
    public String updateEmployeeDetails(@PathVariable int id,@RequestBody Employee e) {
        Employee emp = getById(id);
        if (emp != null) {
            if (e.getName() != null) {
                emp.setName(e.getName());
            } else if (e.getId() != 0) {
                emp.setId(e.getId());
            } else if (e.getSalary() != 0.0) {
                emp.setSalary(e.getSalary());
            }
            jpa.save(emp);
            return "Data saved";
        }
        else{
            throw  new EmployeeNotFoundException("Employee not found Exception");
        }
    }

    @DeleteMapping("/delete-emp/{id}")
    public String deleteEmployee(@PathVariable int id){
        Employee emp=getById(id);
        if(emp!=null)
        {
            jpa.delete(emp);
            return "Deleted";
        }
        else{
            return "Data Not exits";
        }

    }

    @GetMapping("/find-name/{name}")
    public Employee findByName(@PathVariable String name){
        return jpa.getByName(name);
    }
    @GetMapping("/find-salary/{salary}")
    public Employee findBySalary(@PathVariable String salary){
        return jpa.getByName(salary);
    }

    @GetMapping("/find/{name}/{salary}")
    public Employee findByNameAndSalary(@PathVariable String name,@PathVariable int salary){
        return jpa.findByNameAndSalary(name,salary);
    }

    @PutMapping("/update-salary/{oldsalary}/{newsalary}")
    public String updateBySalary(@PathVariable double oldsalary,
                              @PathVariable double newsalary){
        int count=jpa.updateBySalary(oldsalary, newsalary);
        if(count>0){
            return "Updated";
        }
        else{
            throw new EmployeeNotFoundException("Employee Not found with salary: "+oldsalary);
        }
    }

    @GetMapping("/get-page/{page}/{size}")
    public List<Employee> getEmpData(@PathVariable int page,@PathVariable int size){
        Page<Employee> pageable=jpa.findAll(PageRequest.of(page,size));
        return pageable.getContent();
    }

//
//    @GetMapping("/b")
//    http://localhost:8080/b?name=Allen&id=10&age20
//    public String sendData(@RequestParam String name){
//        System.out.println(name);
//        return "Success";
//    }

}
