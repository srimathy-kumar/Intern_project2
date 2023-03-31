package com.Friend.Friendzee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Friend.Friendzee.entity.PostEntity;


@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String>{
	
}
