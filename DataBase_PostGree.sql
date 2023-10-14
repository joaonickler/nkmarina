-- Database: nkmarina

-- DROP DATABASE IF EXISTS nkmarina;

CREATE DATABASE nkmarina
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

COMMENT ON DATABASE nkmarina
    IS 'Banco de dados do projeto da marina';


-- Table: public.embarcacao

-- DROP TABLE IF EXISTS public.embarcacao;

CREATE TABLE IF NOT EXISTS public.embarcacao
(
    id_embarc bigint NOT NULL,
    nm_embarc character varying(255) COLLATE pg_catalog."default" NOT NULL,
    id_situacao integer NOT NULL,
    dh_registro timestamp(6) without time zone NOT NULL,
    CONSTRAINT embarcacao_pkey PRIMARY KEY (id_embarc)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.embarcacao
    OWNER to postgres;