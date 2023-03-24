CREATE SCHEMA IF NOT EXISTS product;
CREATE TABLE IF NOT EXISTS product.organizations
(
    id uuid not null
    constraint organizations_pkey primary key,
    name varchar,
    description varchar
);