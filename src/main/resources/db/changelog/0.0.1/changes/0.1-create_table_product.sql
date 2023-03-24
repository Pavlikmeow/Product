CREATE SCHEMA IF NOT EXISTS product;
CREATE TABLE IF NOT EXISTS product.products
(
    id uuid not null
    constraint product_pkey primary key,
    name varchar,
    description varchar,
    price decimal,
    in_stock int,
    organization_id uuid
);