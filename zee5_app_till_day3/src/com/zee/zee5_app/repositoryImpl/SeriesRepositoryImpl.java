package com.zee.zee5_app.repositoryImpl;

import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.repository.SeriesRepository;
import com.zee.zee5_app.repository.SubscriptionRepository;

public class SeriesRepositoryImpl implements SeriesRepository {

	 
    private SeriesRepositoryImpl() {
		
	}
	private static SeriesRepository repository;
	
	// in below command why we mentioned return type as interface?
	
	public static SeriesRepository getInstance() {
		if(repository == null) {
			repository = new SeriesRepositoryImpl();
		}
		return repository;
	}
	
	
	@Override
	public String add(Series series) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String del(String id, Series series2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(String id, Series series2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Series[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Series getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
