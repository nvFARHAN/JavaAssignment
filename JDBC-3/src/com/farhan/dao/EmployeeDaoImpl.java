package com.farhan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.farhan.bean.Employee;
import com.farhan.exceptions.EmployeeException;
import com.farhan.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int getSalaryById(int id) throws EmployeeException {
		int salary = -1;
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select salary from employee where eid = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				salary = rs.getInt("salary");
			else {
				EmployeeException ee = new EmployeeException("No employee with eid = " + id);
				throw ee;
			}
		} catch (SQLException e) {
			EmployeeException ee = new EmployeeException(e.getMessage());
			throw ee;
		}
		return salary;
	}

	@Override
	public List<Employee> getEmployees() throws EmployeeException {
		List<Employee> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setEid(rs.getInt("eid"));
				e.setName(rs.getString("name"));
				e.setAddress(rs.getString("address"));
				e.setSalary(rs.getInt("salary"));
				list.add(e);
			}
		} catch (SQLException e) {
			EmployeeException ee = new EmployeeException(e.getMessage());
			throw ee;
		}
		return list;
	}

	@Override
	public String addBonus() {
		String msg = "No bonus added";
		try (Connection conn = DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("update employee set salary = salary + 50");
			int x = ps.executeUpdate();
			if (x > 0)
				msg = "Bonus added to salary";
		} catch (SQLException e) {
			msg = e.getMessage();
		}
		return msg;
	}

	@Override
	public String addPartialDetails(Employee e) {
		String msg = "Employee not added to DB";
		try (Connection conn = DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("insert into employee(eid,name,salary) values (?,?,?)");
			ps.setInt(1, e.getEid());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getSalary());
			int x = ps.executeUpdate();
			if (x > 0)
				msg = "Employee added to DB";
		} catch (SQLException ex) {
			msg = ex.getMessage();
		}
		return msg;
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException {
		Employee e = null;
		try (Connection conn = DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("select * from employee where eid = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				e = new Employee();
				e.setEid(rs.getInt("eid"));
				e.setName(rs.getString("name"));
				e.setAddress(rs.getString("address"));
				e.setSalary(rs.getInt("salary"));
			} else {
				EmployeeException ee = new EmployeeException("Employee not found with eid : " + id);
				throw ee;
			}
		} catch (SQLException ex) {
			EmployeeException ee = new EmployeeException(ex.getMessage());
			throw ee;
		}
		return e;
	}

	@Override
	public List<Employee> filterEmployeeBySalary() throws EmployeeException {
		List<Employee> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("select * from employee where salary<80000");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setEid(rs.getInt("eid"));
				e.setName(rs.getString("name"));
				e.setAddress(rs.getString("address"));
				e.setSalary(rs.getInt("salary"));
				list.add(e);
			}
		} catch (SQLException e) {
			EmployeeException ee = new EmployeeException(e.getMessage());
			throw ee;
		}
		return list;
	}

}
