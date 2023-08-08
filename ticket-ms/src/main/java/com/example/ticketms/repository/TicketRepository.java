package com.example.ticketms.repository;

import com.example.ticketms.entity.Ticket;
import com.example.ticketms.entity.enums.TicketStatus;
import feign.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long>, JpaSpecificationExecutor<Ticket> {

    @Query("SELECT t FROM Ticket t join fetch t.ticketDetails WHERE :status IS NULL OR t.ticketStatus = :status")
    List<Ticket> getAllByTicketStatus(@Param("status") TicketStatus status, Pageable pageable);
}
