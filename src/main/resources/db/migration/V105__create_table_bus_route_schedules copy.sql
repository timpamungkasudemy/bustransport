CREATE TABLE IF NOT EXISTS bus_route_schedules (
    bus_route_schedule_uuid UUID PRIMARY KEY,
    bus_route_uuid UUID,
    bus_route_schedule_code TEXT NOT NULL UNIQUE,
    bus_route_schedule_name TEXT NOT NULL,
    bus_class TEXT NOT NULL,
    capacity INTEGER NOT NULL,
    departure_time TIMESTAMPTZ NOT NULL,
    arrival_time TIMESTAMPTZ NOT NULL,
    created_by TEXT NOT NULL,
    updated_by TEXT NOT NULL,
    deleted BOOLEAN NOT NULL DEFAULT FALSE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    deleted_at TIMESTAMPTZ,
    CONSTRAINT fk_bus_route
        FOREIGN KEY (bus_route_uuid)
        REFERENCES bus_routes(bus_route_uuid)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);