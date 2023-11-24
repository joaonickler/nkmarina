DROP TABLE IF EXISTS public.usuario;

CREATE TABLE IF NOT EXISTS public.usuario
(
    id bigint NOT NULL DEFAULT nextval('usuario_id_seq'::regclass),
    username character varying(255) COLLATE pg_catalog."default" NOT NULL,
    password character varying(255) COLLATE pg_catalog."default" NOT NULL,
    enabled boolean NOT NULL,
    CONSTRAINT usuario_pkey PRIMARY KEY (id),
    CONSTRAINT usuario_username_key UNIQUE (username)
)
TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.usuario    OWNER to postgres;



CREATE SEQUENCE IF NOT EXISTS public.usuario_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1
    OWNED BY usuario.id;

ALTER SEQUENCE public.usuario_id_seq     OWNER TO postgres;
-------------------------------------------------------// -----------------------------------------------


DROP TABLE IF EXISTS public.embarcacao;

CREATE TABLE IF NOT EXISTS public.embarcacao
(
    nm_embarc character varying(255) COLLATE pg_catalog."default" NOT NULL,
    tipo_embarc integer,
    id_embarc integer NOT NULL DEFAULT nextval('embarc_id_embarc_seq'::regclass),
    nrmarinha_embarc character varying COLLATE pg_catalog."default",
    cliente_id integer NOT NULL,
    CONSTRAINT embarcacao_pkey PRIMARY KEY (id_embarc),
    CONSTRAINT fkfkqcdcylyf79pm40odbscnqgv FOREIGN KEY (cliente_id)
        REFERENCES public.cliente (id_cliente) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.embarcacao     OWNER to postgres;


CREATE SEQUENCE IF NOT EXISTS public.embarc_id_embarc_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.embarc_id_embarc_seq      OWNER TO postgres;

-------------------------------------------------------//  -----------------------------------------------




DROP TABLE IF EXISTS public.cliente;

CREATE TABLE IF NOT EXISTS public.cliente
(
    id_cliente integer NOT NULL DEFAULT nextval('cliente_id_cliente_seq'::regclass),
    nm_cliente character varying(100) COLLATE pg_catalog."default" NOT NULL,
    end_cliente character varying(100) COLLATE pg_catalog."default",
    tel_cliente character varying(50) COLLATE pg_catalog."default" NOT NULL,
    email_cliente character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.cliente     OWNER to postgres;


CREATE SEQUENCE IF NOT EXISTS public.cliente_id_cliente_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.cliente_id_cliente_seq      OWNER TO postgres;

-------------------------------------------------------//  -----------------------------------------------



DROP TABLE IF EXISTS public.checklist;

CREATE TABLE IF NOT EXISTS public.checklist
(
    id_check integer NOT NULL DEFAULT nextval('check_id_check_seq'::regclass),
    embarcacao_id integer NOT NULL,
    situacao_check character varying(1) COLLATE pg_catalog."default",
    tipo_check integer,
    CONSTRAINT checklist_embarcacao_pkey PRIMARY KEY (id_check),
    CONSTRAINT fkas2k9rncbmgib97te1lrbe00m FOREIGN KEY (embarcacao_id)
        REFERENCES public.embarcacao (id_embarc) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.checklist     OWNER to postgres;


DROP SEQUENCE IF EXISTS public.check_id_check_seq;

CREATE SEQUENCE IF NOT EXISTS public.check_id_check_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.check_id_check_seq      OWNER TO postgres;

-------------------------------------------------------//  -----------------------------------------------


DROP TABLE IF EXISTS public.agenda;

CREATE TABLE IF NOT EXISTS public.agenda
(
    id_agenda integer NOT NULL DEFAULT nextval('agenda_id_agenda_seq'::regclass),
    dh_cadastro_agenda timestamp(6) without time zone NOT NULL,
    dh_solicit_agenda timestamp(6) without time zone NOT NULL,
    cliente_id integer,
    situacao_agenda integer,
    embarc_id integer, 
    CONSTRAINT agenda_pkey PRIMARY KEY (id_agenda),
    CONSTRAINT fk9ovuenx1vsuek79lwfi5mqng4 FOREIGN KEY (cliente_id)
        REFERENCES public.cliente (id_cliente) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.agenda     OWNER to postgres;

DROP SEQUENCE IF EXISTS public.agenda_id_agenda_seq;


CREATE SEQUENCE IF NOT EXISTS public.agenda_id_agenda_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.agenda_id_agenda_seq      OWNER TO postgres;





