CREATE TABLE Consulta(
	IdProcedimento INT,
	CpfMedico CHAR(14) NOT NULL,
	Sintomas VARCHAR(100),
	PRIMARY KEY (IdProcedimento),
	FOREIGN KEY (IdProcedimento) REFERENCES Procedimento(Id),
	FOREIGN KEY (CpfMedico) REFERENCES Medico(Cpf)
)