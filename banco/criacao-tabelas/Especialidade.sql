CREATE TABLE Especialidade(
	CpfMedico CHAR(14),
	Especialidade VARCHAR(50),
	PRIMARY KEY (CpfMedico, Especialidade),
	FOREIGN KEY (CpfMedico) REFERENCES Medico(Cpf)
)