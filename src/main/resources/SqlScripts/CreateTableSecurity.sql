-- Table: public.security

-- DROP TABLE public.security;

CREATE TABLE IF NOT EXISTS public.security
(
    id character varying(36) COLLATE pg_catalog."default" NOT NULL,
    key character varying(32) COLLATE pg_catalog."default" NOT NULL,
    createdate timestamp without time zone NOT NULL,
    CONSTRAINT security_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.security
    OWNER to ahmet;