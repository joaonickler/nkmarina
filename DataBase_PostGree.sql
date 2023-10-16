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



CREATE TABLE IF NOT EXISTS public.cliente
(
    id_cliente smallint NOT NULL,
    nm_cliente character(1) COLLATE pg_catalog."default" NOT NULL,
    end_cliente character(1) COLLATE pg_catalog."default",
    tel_cliente character(1) COLLATE pg_catalog."default" NOT NULL,
    email_cliente character(1) COLLATE pg_catalog."default",
    dt_inclusao date NOT NULL,
    CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.cliente
    OWNER to postgres;



-- Table: public.agenda

-- DROP TABLE IF EXISTS public.agenda;

CREATE TABLE IF NOT EXISTS public.agenda
(
    id_agenda smallint NOT NULL,
    dh_cadastro date NOT NULL,
    dh_solicitacao date NOT NULL,
    id_situacao character(1) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT agenda_pkey PRIMARY KEY (id_agenda)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.agenda
    OWNER to postgres;



