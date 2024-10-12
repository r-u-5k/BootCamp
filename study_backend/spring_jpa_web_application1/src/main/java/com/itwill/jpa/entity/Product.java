package com.itwill.jpa.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(name = "product_seq", initialValue = 1, allocationSize = 1)
    private Long productId;
	private String name;
    private Integer price;
    private Integer stock;
    @CreationTimestamp // JPA에서 날짜 자동 삽입
    @ColumnDefault("sysdate") // SQL에서 날짜 자동 삽입
    private LocalDateTime createdAt;
    @UpdateTimestamp // JPA에서 수정 시 날짜 자동 업데이트
    private LocalDateTime updatedAt;
}
