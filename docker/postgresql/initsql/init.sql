create table board (
	id bigint not null,
	title varchar(100) not null,
	content varchar(500) not null,
	createDate timestamp not null,
	modifyDate timestamp not null,
	primary key (id)
);

CREATE SEQUENCE board_id_seq;

ALTER SEQUENCE board_id_seq
OWNED BY board.id;


INSERT INTO board values(1, 'test title', 'test contents !!', now(), now() );
INSERT INTO board values(2, 'test title 2', 'test contents !!', now(), now() );
