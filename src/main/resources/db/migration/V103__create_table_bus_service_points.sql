CREATE TABLE IF NOT EXISTS bus_service_points (
    bus_service_point_uuid UUID PRIMARY KEY,
    bus_service_point_code TEXT NOT NULL UNIQUE,
    bus_service_point_name TEXT NOT NULL,
    bus_service_point_address TEXT NOT NULL,
    active BOOLEAN NOT NULL DEFAULT FALSE,
    geo_point_latitude DOUBLE PRECISION,
    geo_point_longitude DOUBLE PRECISION,
    created_by TEXT NOT NULL,
    updated_by TEXT NOT NULL,
    deleted BOOLEAN NOT NULL DEFAULT FALSE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    deleted_at TIMESTAMPTZ,
    city_uuid UUID
);
