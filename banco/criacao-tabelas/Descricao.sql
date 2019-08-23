CREATE TABLE Descricao(
	CpfPaciente CHAR(14),
	Descricao VARCHAR(50),
	PRIMARY KEY (CpfPaciente, Descricao),
	FOREIGN KEY (CpfPaciente) REFERENCES Paciente(Cpf)
)