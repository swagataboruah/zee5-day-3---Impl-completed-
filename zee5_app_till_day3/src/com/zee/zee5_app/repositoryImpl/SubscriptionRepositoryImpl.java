// We can create multiple implementation or Impl files for subscription based on difference scenarios (like when connecting to different databases) and maintain standard which are common 



package com.zee.zee5_app.repositoryImpl;

import com.zee.zee5_app.dto.Subscription;
import com.zee.zee5_app.repository.SubscriptionRepository;


// Here the SubscriptionRepositoryImpl has implemented the SubscriptionRepository class
// And 5 methods are being overridden 

public class SubscriptionRepositoryImpl implements SubscriptionRepository {

	
	// singleton design standard
	private SubscriptionRepositoryImpl() {
		
	}
	private static SubscriptionRepository repository;
	
	// in below command why we mentioned return type as interface?
	
	public static SubscriptionRepository getInstance() {
		if(repository == null) {
			repository = new SubscriptionRepositoryImpl();
		}
		return repository;
	} // singleton design standard
	
	
	
	
	
	
	
	
	@Override
	public String addSubs(Subscription subscription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delSubs(String id, Subscription subscriptions1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSubs(String id, Subscription subscription1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subscription[] getAllSubs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subscription getSubsById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
