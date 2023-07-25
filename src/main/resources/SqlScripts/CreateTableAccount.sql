-- Table: public.account

-- DROP TABLE public.account;

CREATE TABLE IF NOT EXISTS public.account
(
    id character varying(36) COLLATE pg_catalog."default" NOT NULL,
    security_fk character varying(36) COLLATE pg_catalog."default" NOT NULL,
    user_fk character varying(36) COLLATE pg_catalog."default" NOT NULL,
    username character varying(50) COLLATE pg_catalog."default" NOT NULL,
    userpassword text COLLATE pg_catalog."default" NOT NULL,
    description character varying(200) COLLATE pg_catalog."default",
    createdate timestamp without time zone NOT NULL,
    CONSTRAINT account_pkey PRIMARY KEY (id),
    CONSTRAINT account_fk1 FOREIGN KEY (security_fk)
        REFERENCES public.security (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT account_fk2 FOREIGN KEY (user_fk)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public.account
    OWNER to ahmet;