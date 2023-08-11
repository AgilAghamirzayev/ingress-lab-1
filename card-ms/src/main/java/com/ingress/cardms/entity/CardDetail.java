package com.ingress.cardms.entity;

import com.ingress.cardms.entity.enums.CardType;
import com.ingress.cardms.entity.enums.CurrencyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "card_details")
public class CardDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardNumber;
    private LocalDate expirationDate;
    private String cvv;
    @Enumerated(EnumType.STRING)
    private CardType cardType;
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;
}
