CREATE TABLE IF NOT EXISTS bus_tickets (
    bus_ticket_uuid UUID PRIMARY KEY,
    bus_route_schedule_uuid UUID,
    ticket_number TEXT NOT NULL UNIQUE,
    issued_at TIMESTAMPTZ NOT NULL,
    paid BOOLEAN NOT NULL DEFAULT FALSE,
    refunded BOOLEAN NOT NULL DEFAULT FALSE,
    canceled BOOLEAN NOT NULL DEFAULT FALSE,
    customer_uuid UUID,
    created_by TEXT NOT NULL,
    updated_by TEXT NOT NULL,
    deleted BOOLEAN NOT NULL DEFAULT FALSE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    deleted_at TIMESTAMPTZ,
    CONSTRAINT fk_bus_route_schedule
        FOREIGN KEY (bus_route_schedule_uuid)
        REFERENCES bus_route_schedules(bus_route_schedule_uuid)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);