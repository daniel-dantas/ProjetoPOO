CREATE TABLE Exame(
	IdProcedimento INT,
	TIPO VARCHAR(20) NOT NULL,
	Resultado VARCHAR(200),
	PRIMARY KEY (IdProcedimento),
	FOREIGN KEY (IdProcedimento) REFERENCES Procedimento(Id)
)