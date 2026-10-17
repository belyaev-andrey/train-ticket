package edu.fudan.common.entity;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.BeforeExecutionGenerator;
import org.hibernate.generator.EventType;
import org.hibernate.generator.EventTypeSets;

import java.util.EnumSet;
import java.util.UUID;

/**
 * @see AssignableUuid
 */
public class AssignableUuidGenerator implements BeforeExecutionGenerator {

    private final boolean hex;

    public AssignableUuidGenerator(AssignableUuid config) {
        this.hex = config.hex();
    }

    @Override
    public Object generate(SharedSessionContractImplementor session, Object owner, Object currentValue, EventType eventType) {
        if (currentValue != null) {
            return currentValue;
        }
        String uuid = UUID.randomUUID().toString();
        return hex ? uuid.replace("-", "") : uuid;
    }

    @Override
    public EnumSet<EventType> getEventTypes() {
        return EventTypeSets.INSERT_ONLY;
    }

    @Override
    public boolean allowAssignedIdentifiers() {
        return true;
    }
}
