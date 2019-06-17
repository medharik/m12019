create table jet_ski(
Numero_Jet_Ski integer primary key,
Numero_Modele number(6),
Date_mise_en_service date,
couleur varchar2(15),
constraint foreign key(Numero_Modele) references modeles(Numero_Modele)
)