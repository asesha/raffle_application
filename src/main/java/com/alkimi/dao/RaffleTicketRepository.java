package com.alkimi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkimi.entities.RaffleTicket;

@Repository
public interface RaffleTicketRepository extends JpaRepository<RaffleTicket, Integer> {

	List<RaffleTicket> findByRaffleIdRaffleId(int raffleId);
	Optional<RaffleTicket> findByRaffleIdRaffleIdAndTicketId(int raffleId, int ticketId);
}
