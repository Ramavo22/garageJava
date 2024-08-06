DROP DATABASE IF EXISTS mygarage;
CREATE DATABASE mygarage;
\c mygarage;

CREATE TABLE "slot"(
    "id"                SMALLSERIAL PRIMARY KEY                             NOT NULL,
    "label"             VARCHAR(5)                                          NOT NULL
);

CREATE TABLE "roles"(
    "id"                SMALLSERIAL PRIMARY KEY                             NOT NULL,
    "label"             VARCHAR(15)                                         NOT NULL
);

CREATE TABLE "users"(
    "id"                BIGSERIAL   PRIMARY KEY                             NOT NULL,
    "firstname"         VARCHAR(50)                                         NOT NULL,
    "lastname"          VARCHAR(50)                                         NOT NULL,
    "mail"              VARCHAR(100)                                        NOT NULL,
    "pwd"               VARCHAR(60)                                         NOT NULL,
    "roles_id"          SMALLINT    REFERENCES "roles" ("id")               NOT NULL
);

CREATE TABLE "services"(
    "id"                SERIAL PRIMARY KEY                                  NOT NULL,
    "label"             VARCHAR(50)                                         NOT NULL,
    "prix"              DOUBLE PRECISION                                    NOT NULL CHECK ("prix" >= 0),
    "heure"             TIME                                                NOT NULL
);

CREATE TABLE "travaux"(
    "id"                BIGSERIAL   PRIMARY KEY                             NOT NULL,
    "date_heure_debut"  TIMESTAMP                                           NOT NULL,
    "date_heure_fin"    TIMESTAMP                                           NOT NULL,
    "user_id"           BIGINT      REFERENCES "users" ("id")               NOT NULL,
    "service_id"        INTEGER     REFERENCES "services" ("id")            NOT NULL,
    "slot_id"           SMALLINT    REFERENCES "slot" ("id")                NOT NULL,
    "prix"              DOUBLE PRECISION                                    NOT NULL CHECK ("prix" >= 0),
    "date_paiement"     TIMESTAMP   DEFAULT NULL
);

CREATE TABLE "type_employe"(
    "id"                SMALLSERIAL PRIMARY KEY                             NOT NULL,
    "label"             VARCHAR(50)                                         NOT NULL,
    "salaire"           DOUBLE PRECISION                                    NOT NULL CHECK ("salaire" > 0)
);

CREATE TABLE "employe"(
    "id"                BIGSERIAL   PRIMARY KEY                             NOT NULL,
    "user_id"           BIGINT      REFERENCES "users" ("id")               NOT NULL,
    "type_employe_id"   SMALLINT    REFERENCES "type_employe" ("id")        NOT NULL
);

CREATE TABLE "travaux_personnel"(
    "travaux_id"        BIGINT      REFERENCES "travaux" ("id")             NOT NULL,
    "employe_id"        BIGINT      REFERENCES "employe" ("id")             NOT NULL,
    PRIMARY KEY ("travaux_id", "employe_id")
);

CREATE TABLE "day_off"(
    "id"                BIGSERIAL   PRIMARY KEY                             NOT NULL,
    "employe_id"        BIGINT      REFERENCES "employe" ("id")             NOT NULL,
    "date_debut"        DATE                                                NOT NULL,
    "number_of_days"    INTEGER                                             NOT NULL CHECK ("number_of_days" > 0),      
    "date_demande"      TIMESTAMP                                           NOT NULL,
    "date_reponse"      TIMESTAMP   DEFAULT NULL,
    "is_validated"      BOOLEAN     DEFAULT NULL                                        
);
