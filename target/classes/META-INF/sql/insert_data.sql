INSERT INTO `jpa_game`.`joueur` (`id_joueur`, `nom`, `mail`, `pseudo`) VALUES (1, 'yoann', 'yoann@plop.frf', 'John');
INSERT INTO `jpa_game`.`joueur` (`id_joueur`, `nom`, `mail`, `pseudo`) VALUES (2, 'alexandre', 'alexndre@plop.frf', 'Tremble');
INSERT INTO `jpa_game`.`joueur` (`id_joueur`, `nom`, `mail`, `pseudo`) VALUES (3, 'DOE', 'doe@plop.frf', 'Chat moche');
INSERT INTO `jpa_game`.`joueur` (`id_joueur`, `nom`, `mail`, `pseudo`) VALUES (4, 'youcef', 'youcef@plop.fr', 'Youyou');
INSERT INTO `jpa_game`.`joueur` (`id_joueur`, `nom`, `mail`, `pseudo`) VALUES (5, 'amandine', 'amandine@plop.frf', 'Ola');
INSERT INTO `jpa_game`.`joueur` (`id_joueur`, `nom`, `mail`, `pseudo`) VALUES (6, 'samir', 'samir@plop.frf', 'Samuel');
INSERT INTO `jpa_game`.`joueur` (`id_joueur`, `nom`, `mail`, `pseudo`) VALUES (7, 'anniss', 'anniss@plop.frf', 'Riri');
INSERT INTO `jpa_game`.`partie` (`id_partie`, `date_`, `niveau`, `score`) VALUES (1, '2018-10-20', '7', '456762');
INSERT INTO `jpa_game`.`partie` (`id_partie`, `date_`, `niveau`, `score`) VALUES (2, '2018-10-20', '4', '4567');
INSERT INTO `jpa_game`.`partie` (`id_partie`, `date_`, `niveau`, `score`) VALUES (3, '2018-10-20', '7', '23');
INSERT INTO `jpa_game`.`partie` (`id_partie`, `date_`, `niveau`, `score`) VALUES (4, '2018-10-20', '4', '21');
INSERT INTO `jpa_game`.`joueur_partie` ( `id_joueur`, `id_partie`) VALUES (1,2);
INSERT INTO `jpa_game`.`joueur_partie` ( `id_joueur`, `id_partie`) VALUES (3,3);
INSERT INTO `jpa_game`.`joueur_partie` ( `id_joueur`, `id_partie`) VALUES (2,4);
INSERT INTO `jpa_game`.`joueur_partie` ( `id_joueur`, `id_partie`) VALUES (4,1);
COMMIT;