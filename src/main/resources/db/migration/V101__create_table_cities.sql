CREATE TABLE IF NOT EXISTS cities (
    city_uuid UUID PRIMARY KEY,
    city_code TEXT NOT NULL,
    city_name TEXT NOT NULL,
    city_phone_code VARCHAR(5) NOT NULL,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    created_by TEXT,
    updated_by TEXT,
    deleted BOOLEAN,
    deleted_at TIMESTAMPTZ,
    country_uuid UUID,
    CONSTRAINT fk_country
        FOREIGN KEY (country_uuid)
        REFERENCES countries(country_uuid)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    CONSTRAINT unique_country_city_code UNIQUE (country_uuid, city_code)
);
