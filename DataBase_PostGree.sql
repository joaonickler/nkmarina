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


-- Table: public.agenda

-- DROP TABLE IF EXISTS public.agenda;

CREATE TABLE IF NOT EXISTS public.agenda
(
    id_agenda integer NOT NULL,
    dh_cadastro timestamp(6) without time zone NOT NULL,
    dh_solicitacao timestamp(6) without time zone NOT NULL,
    id_situacao character varying(1) COLLATE pg_catalog."default" NOT NULL,
    id_cliente integer,
    CONSTRAINT agenda_pkey PRIMARY KEY (id_agenda),
    CONSTRAINT fk9ovuenx1vsuek79lwfi5mqng4 FOREIGN KEY (id_cliente)
        REFERENCES public.cliente (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.agenda
    OWNER to postgres;



-- Table: public.cliente

-- DROP TABLE IF EXISTS public.cliente;

CREATE TABLE IF NOT EXISTS public.cliente
(
    id integer NOT NULL,
    nm_cliente character varying(255) COLLATE pg_catalog."default" NOT NULL,
    end_cliente character varying(255) COLLATE pg_catalog."default",
    tel_cliente character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email_cliente character varying(255) COLLATE pg_catalog."default",
    dt_inclusao timestamp(6) without time zone NOT NULL,
    CONSTRAINT cliente_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.cliente
    OWNER to postgres;


-- Table: public.embarcacao

-- DROP TABLE IF EXISTS public.embarcacao;

CREATE TABLE IF NOT EXISTS public.embarcacao
(
    id integer NOT NULL,
    nm_embarc character varying(255) COLLATE pg_catalog."default" NOT NULL,
    dh_registro timestamp(6) without time zone NOT NULL,
    id_situacao character varying(255) COLLATE pg_catalog."default",
    nr_marinha character varying(255) COLLATE pg_catalog."default",
    id_cliente integer,
    tipo integer,
    CONSTRAINT embarcacao_pkey PRIMARY KEY (id),
    CONSTRAINT fkfkqcdcylyf79pm40odbscnqgv FOREIGN KEY (id_cliente)
        REFERENCES public.cliente (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.embarcacao
    OWNER to postgres;