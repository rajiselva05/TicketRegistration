package com.project.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {
@Query("select t from Ticket t where t.emailid=?1")
public Ticket getByEmailid(String emailid);


}
