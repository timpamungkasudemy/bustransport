CREATE TABLE IF NOT EXISTS bus_routes (
    bus_route_uuid UUID PRIMARY KEY,
    departure_service_point_uuid UUID,
    arrival_service_point_uuid UUID,
    bus_route_code TEXT NOT NULL UNIQUE,
    bus_route_name TEXT NOT NULL,
    bus_route_description TEXT,
    created_by TEXT NOT NULL,
    updated_by TEXT NOT NULL,
    deleted BOOLEAN NOT NULL DEFAULT FALSE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    deleted_at TIMESTAMPTZ,
    active BOOLEAN NOT NULL DEFAULT FALSE,
    CONSTRAINT fk_departure_service_point
        FOREIGN KEY (departure_service_point_uuid)
        REFERENCES bus_service_points(bus_service_point_uuid)
        ON DELETE SET NULL
        ON UPDATE CASCADE,
    CONSTRAINT fk_arrival_service_point
        FOREIGN KEY (arrival_service_point_uuid)
        REFERENCES bus_service_points(bus_service_point_uuid)
        ON DELETE SET NULL
        ON UPDATE CASCADE
);