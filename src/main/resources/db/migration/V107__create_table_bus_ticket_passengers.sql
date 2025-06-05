CREATE TABLE IF NOT EXISTS bus_ticket_passengers (
    bus_ticket_passenger_uuid UUID PRIMARY KEY,
    seat_number TEXT NOT NULL,
    passenger_name TEXT NOT NULL,
    passenger_phone TEXT NOT NULL,
    bus_ticket_uuid UUID,
    created_by TEXT NOT NULL,
    updated_by TEXT NOT NULL,
    deleted BOOLEAN NOT NULL DEFAULT FALSE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    deleted_at TIMESTAMPTZ,
    CONSTRAINT fk_bus_ticket
        FOREIGN KEY (bus_ticket_uuid)
        REFERENCES bus_tickets(bus_ticket_uuid)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);