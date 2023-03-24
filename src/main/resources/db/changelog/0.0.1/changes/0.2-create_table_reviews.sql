CREATE SCHEMA IF NOT EXISTS product;
CREATE TABLE IF NOT EXISTS product.reviews
(
    id uuid not null
    constraint review_pkey primary key,
    text varchar,
    rating int,
    product_id uuid
);