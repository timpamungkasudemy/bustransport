-- Insert countries
INSERT INTO countries (country_uuid, country_code, country_name, currency_code, international_phone_code, created_by, updated_by)
VALUES
    ('e1b7c2e2-1a4b-4f7e-9c8a-2d3f5b6c7a8e', 'DE', 'Germany', 'EUR', '+49', 'system', 'system'),
    ('a3d2f1c4-5b6e-4a7d-8c9b-1e2f3a4b5c6d', 'US', 'United States', 'USD', '+1', 'system', 'system'),
    ('b9e8d7c6-2f3a-4b5c-8d9e-7c6b5a4f3e2d', 'ID', 'Indonesia', 'IDR', '+62', 'system', 'system');

-- Insert cities for Germany
INSERT INTO cities (city_uuid, city_code, city_name, city_phone_code, created_by, updated_by, country_uuid)
VALUES
    ('f3e2d1c4-7b8a-4c5d-9e0f-1a2b3c4d5e6f', 'BER', 'Berlin', '30', 'system', 'system', 'e1b7c2e2-1a4b-4f7e-9c8a-2d3f5b6c7a8e'),
    ('a6b5c4d3-2e1f-4a7b-8c9d-0e1f2a3b4c5d', 'MUC', 'Munich', '89', 'system', 'system', 'e1b7c2e2-1a4b-4f7e-9c8a-2d3f5b6c7a8e'),
    ('b7c6d5e4-3f2a-4b1c-8d9e-0f1a2b3c4d5e', 'FRA', 'Frankfurt', '69', 'system', 'system', 'e1b7c2e2-1a4b-4f7e-9c8a-2d3f5b6c7a8e'),
    ('c8d7e6f5-4a3b-5c2d-9e0f-1b2c3d4e5f6a', 'HAM', 'Hamburg', '40', 'system', 'system', 'e1b7c2e2-1a4b-4f7e-9c8a-2d3f5b6c7a8e');

-- Insert cities for United States
INSERT INTO cities (city_uuid, city_code, city_name, city_phone_code, created_by, updated_by, country_uuid)
VALUES
    ('d1e2f3a4-5b6c-7d8e-9f0a-1b2c3d4e5f6a', 'NYC', 'New York', '212', 'system', 'system', 'a3d2f1c4-5b6e-4a7d-8c9b-1e2f3a4b5c6d'),
    ('e2f3a4b5-6c7d-8e9f-0a1b-2c3d4e5f6a7b', 'LAX', 'Los Angeles', '213', 'system', 'system', 'a3d2f1c4-5b6e-4a7d-8c9b-1e2f3a4b5c6d'),
    ('f3a4b5c6-7d8e-9f0a-1b2c-3d4e5f6a7b8c', 'CHI', 'Chicago', '312', 'system', 'system', 'a3d2f1c4-5b6e-4a7d-8c9b-1e2f3a4b5c6d'),
    ('a4b5c6d7-8e9f-0a1b-2c3d-4e5f6a7b8c9d', 'HOU', 'Houston', '713', 'system', 'system', 'a3d2f1c4-5b6e-4a7d-8c9b-1e2f3a4b5c6d');

-- Insert cities for Indonesia
INSERT INTO cities (city_uuid, city_code, city_name, city_phone_code, created_by, updated_by, country_uuid)
VALUES
    ('b5c6d7e8-9f0a-1b2c-3d4e-5f6a7b8c9d0e', 'JKT', 'Jakarta', '21', 'system', 'system', 'b9e8d7c6-2f3a-4b5c-8d9e-7c6b5a4f3e2d'),
    ('c6d7e8f9-0a1b-2c3d-4e5f-6a7b8c9d0e1f', 'SBY', 'Surabaya', '31', 'system', 'system', 'b9e8d7c6-2f3a-4b5c-8d9e-7c6b5a4f3e2d'),
    ('d7e8f9a0-1b2c-3d4e-5f6a-7b8c9d0e1f2a', 'BDG', 'Bandung', '22', 'system', 'system', 'b9e8d7c6-2f3a-4b5c-8d9e-7c6b5a4f3e2d'),
    ('e8f9a0b1-2c3d-4e5f-6a7b-8c9d0e1f2a3b', 'DPS', 'Denpasar', '361', 'system', 'system', 'b9e8d7c6-2f3a-4b5c-8d9e-7c6b5a4f3e2d');