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
	public String saveEmployeeDetails(Employee e) {
		String msg = "Employee not added to DB";
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into employee values (?,?,?,?)");
			ps.setInt(1, e.getEid());
			ps.setString(2, e.getName());
			ps.setString(3, e.getAddress());
			ps.setInt(4, e.getSalary());
			int x = ps.executeUpdate();
			if (x > 0)
				msg = "Employee added to DB";
		} catch (SQLException ex) {
			msg = ex.getMessage();
		}
		return msg;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setEid(rs.getInt("empId"));
				e.setName(rs.getString("name"));
				e.setAddress(rs.getString("address"));
				e.setSalary(rs.getInt("salary"));
				list.add(e);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException {
		Employee e = null;
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from employee where empId = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				e = new Employee();
				e.setEid(rs.getInt("empId"));
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
	public String deleteEmployee(int empId) throws EmployeeException {
		String msg = "Not deleted";
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("delete from employee where empId=?");
			ps.setInt(1, empId);
			int x = ps.executeUpdate();
			if (x > 0) {
				msg = "Successfully deleted";
			} else {
				EmployeeException ee = new EmployeeException("Employee Id not found");
				throw ee;
			}
		} catch (SQLException e) {
			EmployeeException ee = new EmployeeException(e.getMessage());
			throw ee;
		}
		return msg;
	}

}
