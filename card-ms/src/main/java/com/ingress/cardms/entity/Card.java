package com.ingress.cardms.entity;

import com.ingress.cardms.entity.enums.CardType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "card_derail_id")
    private CardDetail cardDetail;
}
