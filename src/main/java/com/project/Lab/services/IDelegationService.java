package com.project.Lab.services;

import java.util.List;

import com.project.Lab.model.Delegation;
import com.project.Lab.model.User;

public interface IDelegationService {
	
	void save(long userId, Delegation delegation);
	boolean deleteById(long delegationId);
	boolean deleteByUser(long userId);
	void updateDelegation(long DelegationId, Delegation delegation);
	List<Delegation> findAll();
	List<Delegation> findAllOrderByDateStartDesc();
	List<Delegation> findByUserOrderByDateStartDesc(Long userId);
	 
}
