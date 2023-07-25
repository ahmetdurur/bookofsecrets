-- Table: public.platform

-- DROP TABLE public.platform;

CREATE TABLE IF NOT EXISTS public.platform
(
    id character varying(36) COLLATE pg_catalog."default" NOT NULL,
    name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    description character varying(200) COLLATE pg_catalog."default",
    createdate timestamp without time zone NOT NULL,
    CONSTRAINT platform_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.platform
    OWNER to ahmet;