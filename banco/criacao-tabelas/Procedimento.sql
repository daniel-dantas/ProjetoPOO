CREATE TABLE Procedimento(
	Id SERIAL,
	CpfPaciente CHAR(14) NOT NULL,
	Dia DATE NOT NULL,
	Hora TIME NOT NULL,
	PRIMARY KEY (Id),
	FOREIGN KEY (CpfPaciente) REFERENCES Paciente(Cpf)
	ON DELETE CASCADE
)