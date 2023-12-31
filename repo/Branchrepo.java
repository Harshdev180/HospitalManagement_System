package com.jsp.springboot_hospitalmanagementsystem.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.springboot_hospitalmanagementsystem.dto.Branch;
import com.jsp.springboot_hospitalmanagementsystem.dto.Hospital;

public interface Branchrepo extends JpaRepository<Branch, Integer> {

	@Query("select b from Branch b where b.hospital=?1")
	public List<Branch> findBranchByHospitalId(Hospital hospital);

}
