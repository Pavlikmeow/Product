CREATE SCHEMA IF NOT EXISTS product;
CREATE TABLE IF NOT EXISTS product.characteristics
(
    id uuid not null
    constraint characteristics_pkey primary key,
    size varchar,
    weight int,
    product_id uuid
);