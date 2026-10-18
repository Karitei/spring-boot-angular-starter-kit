package com.starterkit.audit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuditLogRepository extends JpaRepository<AuditLog, UUID> {
    Page<AuditLog> findByActor(String actor, Pageable pageable);
    Page<AuditLog> findByEventType(AuditEventType eventType, Pageable pageable);
}
