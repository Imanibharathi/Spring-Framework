package com.goSpring.Spring_with_Hibernate;

import java.util.ArrayList;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDAO 
{
	HibernateTemplate template;
	
	
	

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	@Transactional
	public void saveEmployee(EmployeeDTO e)
	{
		template.save(e);
	}
	@Transactional
	public void updateEmployee(EmployeeDTO e)
	{
		template.update(e);
	}
	@Transactional
	public void deleteEmployee(EmployeeDTO e)
	{
		template.delete(e);
	}
	@Transactional
	public EmployeeDTO getById(int id)
	{
	  EmployeeDTO e = (EmployeeDTO)template.get(EmployeeDTO.class,id);
	  return e;
	}
	@Transactional
	public List<EmployeeDTO> getEmployees()
	{
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		list = template.loadAll(EmployeeDTO.class);
		return list;
	}

}
