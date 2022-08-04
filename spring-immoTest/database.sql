DROP TABLE IF EXISTS `bien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bien` (
  `type_bien` varchar(20) NOT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `adresse` varchar(255) DEFAULT NULL,
  `avaible` bit(1) NOT NULL,
  `code_postal` varchar(255) DEFAULT NULL,
  `date_creation` datetime(6) DEFAULT NULL,
  `description` longtext,
  `image1` varchar(255) DEFAULT NULL,
  `image2` varchar(255) DEFAULT NULL,
  `image3` varchar(255) DEFAULT NULL,
  `image4` varchar(255) DEFAULT NULL,
  `latitude` float DEFAULT NULL,
  `longitude` float DEFAULT NULL,
  `price` double DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `surface` double DEFAULT NULL,
  `titre` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  `etage` int DEFAULT NULL,
  `nombre_pieces` int DEFAULT NULL,
  `nb_locaux` int DEFAULT NULL,
  `sallede_bain` varchar(255) DEFAULT NULL,
  `nombre_piece` int DEFAULT NULL,
  `projet_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnoo1hg8uqwqj3yp41drwsnn9n` (`projet_id`),
  CONSTRAINT `FKnoo1hg8uqwqj3yp41drwsnn9n` FOREIGN KEY (`projet_id`) REFERENCES `projet` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bien`
--

LOCK TABLES `bien` WRITE;
/*!40000 ALTER TABLE `bien` DISABLE KEYS */;
INSERT INTO `bien` VALUES ('APPARTEMENT',1,'7 - Fontaine Chez Trebuchet, Nouvelle-Aquitaine',_binary '\0','17770',NULL,'Quartier R.E.R très recherché et calme.\nAppartement 4 pièces en duplex comprenant : entrée avec placard, ensemble cuisine équipée ouverte sur séjour double donnant sur balcon ensoleillé, salle d\'eau, wc. Etage: palier avec placard, 2 chambres dont une salle de bains et wc. Box double en sous-sol\nUne exclusivité \" LA RESIDENCE \". ','AA4.jpg','AAA4.jpg','AAA2.jpg','AAA3.gif',45.7865,-0.431125,120000,'A vendre',45,'Appartement de luxe','Burie',5,4,NULL,NULL,NULL,NULL),('APPARTEMENT',2,'4 Avenue Henri Vizioz, Nouvelle-Aquitaine',_binary '\0','33600',NULL,'Une valeur sûre pour longtemps.\nA seulement 10 mn A PIED de la gare RER A de Fin d\'Oise, SNCF de Maurecourt (5 mn), et à proximité des écoles primaires et des commerces. Dans résidence très bien entretenue avec espaces verts, BEL APPARTEMENT T4 de 77 m², en très bonne état générale , comprenant : Entrée avec rangements, cuisine équipée semi ouverte sur le SEJOUR DOUBLE avec un acces sur loggia, , 2 chambres (possibilité d\'une 3eme ), 2 espaces dressing, salle d\'eau refaite a neuf il y a 1 ans et, wc séparé . Cave et place de parking privative.\nVous avez tout à gagner en le visitant. ','AA2.jpg','AA1.jpg','AA3.jpg','AA4.jpg',44.7948,-0.621664,50000,'A louer',77,'Appartement','Pessac',1,8,NULL,NULL,NULL,NULL),('APPARTEMENT',3,'14 Les Maradas, Île-de-France',_binary '\0','95000',NULL,'Proche forêt, quartier la bruyère à 12min du RER\nAppartement chaleureux et rénové de type F4, Il vous propose une entrée spacieuse, un séjour double avec balcon exposé plein SUD et SANS VIS A VIS, une cuisine équipée, 2 chambres, salle de bains et wc SUSPENDU indépendant. Une Cave ainsi que DEUX PLACES de parking privatives!!\nUne affaire de haute qualité.','A1.jpg','A2.jpg','A3.jpg','A4.jpg',49.0384,2.0958,20000,'A louer',78,'Appartement de luxe','Pontoise',6,5,NULL,NULL,NULL,NULL),('BUREAU',4,'Rue Saint-Martin, Île-de-France',_binary '\0','95300',NULL,'Le New Yorkais est un très bel espace de travail d’une surface totale de 210 m2, situé dans un immeuble industriel du début du XXème siècle, dans le 10ème arrondissement proche Gare de l\'Est, Gare du Nord et Canal Saint-Martin. \n\n\nCes bureaux bénéficient d’une belle hauteur sous plafond et se composent d’un grand open space, d\'un bureau/salle de réunion en verre, d\'une seconde salle de réunion et d’un coin dédié à la cuisine et la détente.','B4.jpg','B3.jpeg','B2.jpg','B1.jpg',49.0473,2.0912,15000,'A louer',210,'Bureau','Pontoise',6,NULL,8,NULL,NULL,NULL),('VILLA',5,'Impasse 33 Rue Jeanne Wedells, Centre-Val de Loire',_binary '','37100',NULL,'Villa contemporaine située à l\'entrée du golf, à 150 m du club-house (restaurant) et 250 m de la plage du lac - Quartier calme (Voie sans issue) et arboré - Pistes cyclables à deux pas - Accueil personnalisé par propriétaires (demandes complémentaires à formuler 1 mois à l\'avance) - Grandes terrasses dont parties ombragées - jardin arboré  - Linge de lits, nappes et torchons fournis, pas les serviettes de toilette(sauf demande expresse) - Ménage de fin de séjour inclus - Piscine sécurisée 10 × 5 m - Taxe de séjour incluse dans tarifs - consommation eau et électricité incluse.','V1.jpg','V2.jpg','V3.jpg','V4.jpg',47.4074,0.709068,50000,'A louer',110,'Villa luxieuse','Tours',1,NULL,NULL,NULL,6,NULL),('VILLA',6,'Rue de Talence, Nouvelle-Aquitaine',_binary '','33000',NULL,'Offrez-vous une location de luxe pour vos vacances en Vendée. Cette villa en bord de mer vous propose ses 230m2 de surface avec ses 12 couchages : idéal pour une réunion de famille par exemple. \n\nDisposant de 4 chambres, 2 salles de bain et 3 toilettes séparées, cette villa vous offre un confort digne d’un hôtel : \n\n- un salon avec télévision, ordinateur et accès internet avec WiFi\n\n- une cuisine américaine entièrement équipée\n\n- un séjour avec billard\n\n- une chambre Océan avec lits électriques, une chambre Zen, une chambre Romantique et une chambre des Pirates et Princesses\n\n- Une piscine intérieure chauffée avec sauna\n\n- Une terrasse aménagée avec 3 chaises longues et 12 chaises de jardin\n\n-une table de ping-pong\n\nLe jardin clos arboré avec portique et toboggan ajoute une touche naturelle et enfantine à ce tableau de luxe. Vous pourrez ainsi vous prélasser dans le sauna après quelques longueurs dans la piscine, en toute saison. Les enfants pourront s’amuser avec le toboggan pendant ce temps. Le soir, une partie de billard après un repas dans le jardin viendra compléter des vacances de rêves. ','VV1.jpg','VV2.jpg','VV3.jpg','VV4.jpg',44.825,-0.585812,450000,'A louer',230,'Villa','Bordeaux',2,NULL,NULL,NULL,12,NULL),('BUREAU',7,'Rue Pontoise, Île-de-France',_binary '','95520',NULL,'Idéal société de conseil, société financière, avocats ! Wellstone vous propose en exclusivité une surface de 175 m2 en parquet moulures et cheminés avenue de l\'Opéra. Les locaux sont en très bon état, climatisés et meublés . Profitez d\'une durée d\'engagement flexible et de nombreux services adaptés aux besoins de votre activité au sein d\'un immeuble de très bon standing! ','BB2.jpeg','BB1.jpeg','BB3.jpeg','BB4.jpeg',49.0607,2.0686,1500,'A louer',170,'Bureau en location','Osny',7,NULL,9,NULL,NULL,NULL),('TERRAIN',8,'6 - Fontaine Pouvet, Nouvelle-Aquitaine',_binary '','17770',NULL,'beau site situe a 150 metres de la voie abidjan dabou\nvoir plan parcellaire ci joint encadre en couleur bleue\n\nachetez un terrain en toute sécurité avec un arrêt de concession définitive , la vente se réalise devant notaire\n\nTerrains dans une zone déjà habitée avec eau, électricité, pharmacie, marche, gendarmerie etc possibilité de construire dans l\'immédiat','T4.jpg','T3.jpg','T2.jpg','T1.jpg',45.7884,-0.437506,200000,'A louer',500,'terrain en vente','Burie',NULL,NULL,NULL,NULL,NULL,NULL),('BUREAU',9,'Rue de Pontoise, Île-de-France',_binary '\0','95000',NULL,'Bureaux 160m² Concorde\n\nNEXITY Bureaux Commerces vous propose a la location, a toute proximite de la place Concorde et de la rue Saint Honore, un plateau de bureaux au sein d\'un immeuble de bon standing.\nLocaux en tres bon etat, tout equipe, kitchenette, alarme.... Immeuble avec gardien et fibre optique.\nIdeal tout type d\'activite.\nDisponibilite immediatement.\nProvision sur charges 198 € HT/mois, regularisation annuelle. Depot de garantie 22 659 €. Honoraires de 27 189 € HT a la charge du locataire.','BBB1.jpeg','BBB2.jpeg','BBB3.jpeg','BBB4.jpeg',49.042,2.0614,20000,'A louer',150,'Bureau en location','Cergy',10,NULL,5,NULL,NULL,NULL),('VILLA',10,'Parc des Expositions de Paris, Île-de-France',_binary '','75015',NULL,'Lieu connu, au nord-est de la région, position facilement accessible 130 km au sud-ouest de Tarragona, 75 km au nord-est de Castellón de la Plana, 145 km au nord-est de Valencia. Supermarché, magasins, restaurant, bar, animation nocturne. Quartier ancien datant du moyen-âge, très bien entretenu. Château du 13ème siècle où se déroule une petite fête. Autres festivités: Virgen de la Ermitana (08.09) avec danses folkloriques et chansons populaires.\nÉté\n\nPlage de sable, longueur 2 km. Plage de gravier. Parc aquatique \"Aquarama (Benicassim)\" à 60 km. Tennis.','VVV1.jpg','VVV4.jpg','VVV3.jpg','VVV2.jpg',48.8319,2.28841,35000,'A louer',200,'villa en location','Paris',1,NULL,NULL,NULL,5,NULL),('TERRAIN',11,'Rue de Cergy, Île-de-France',_binary '','95000',NULL,'EXCLUSIVITÉ TERRAIN BIEN SITUE au calme de 302 m², Façade de 10,20 m², Non Viabilisé\n\nPermis de construire accepté pour la construction d\'une Maison de 112 m², constructeur libre.','TT4.jpeg','TT3.jpg','TT2.jpg','TT1.jpg',49.0179,2.0569,650000,'A louer',302,'Terrain a cergy','Neuville-sur-Oise',NULL,NULL,NULL,NULL,NULL,NULL),('TERRAIN',12,'Route d\'Osny, Île-de-France',_binary '','95300',NULL,'Terrain Bethemont La Foret 429 m2. A moins de 10 mn en voiture de la gare et du centre de Taverny, dans un village résidentiel très recherché, situé en impasse dans un secteur calme et privilégié, à deux pas d\'un centre équestre, venez construire votre future maison (Rdc + combles) à Bethemont la Forêt!. Directement sur rue, vous disposerez d\'une façade de 20m.. VISITE VIRTUELLE DISPONIBLE.. En exclusivité chez ORPI!.','TTT4.jpeg','TTT3.jpeg','TTT2.jpeg','TTT1.jpeg',49.0765,2.0992,80000,'A louer',429,'Terrain en vente','Ennery',NULL,NULL,NULL,NULL,NULL,NULL),('APPARTEMENT',13,'7 Place des Touleuses, Île-de-France',_binary '\0','95000',NULL,'Une superbe EXCLUSIVITE, un gage de qualité.\nAppartement de 4 pièces comprenant : entrée, ensemble cuisine équipée ouverte sur séjour donnant sur terrasse de 60m² environ, cellier, dégagement, 3 chambres, salle de bains, wc, dressing. Cave et 2 places de parking privé en sous-sol.\nLiaison très aisée avec PARIS par le RER. ','AAAA4.jpg','AAAA2.jpg','AAAA1.jpg','AAAA1.jpg',49.0299,2.083,78000,'A louer',65,'Appartement a cergy','Cergy',2,4,NULL,NULL,NULL,NULL),('APPARTEMENT',14,'18 Les Larris Verts, Île-de-France',_binary '\0','95000',NULL,'Vous profitez d\'un site privilégié proche gare.\nCette magnifique maison proche écoles, transports et accès A15 vous propose une entrée, un séjour double avec cheminée, une cuisine aménagée donnant sur un cellier et un garage attenant avec une cave, un Wc avec lave mains. A l\'étage son palier dessert 3 chambres avec placard, une salle de bains, une salle d\'eau avec wc et un bureau donnant accès aux combles aménagé en suite parental(dressing et salle d\'eau). Son Jardin clos et sans vis à vis d\'env. 342m² vous attend pour profiter des beaux jours. ','AAAAA1.jpg','AAAAA3.jpg','AAAAA2.jpg','AAAA4 .jpg',49.0351,2.0908,45000,'A louer',120,'Appartement de luxe a cergy','Pontoise',1,6,NULL,NULL,NULL,NULL),('BUREAU',15,'1944 Chateau d\'Adrieu Massacre Memorial, Normandie',_binary '','14250',NULL,'Dans le prolongement du 15ème arrondissement, face à Boulogne-Billancourt, la commune a su se doter des moyens nécessaires pour s\'imposer comme un pôle économique capital de la première couronne.\n\nCité d\'affaires, mais aussi quartier de vie, Issy-les-Moulineaux répond à l\'ensemble des besoins de l\'entreprise et de ses collaborateurs.\n\nNous vous proposons plusieurs étages dans un immeuble de très bon standing.Cet immeuble dispose de nombreux services (hotesse d\'accueil, RIE...).Les deux plateaux disponibles sont au R+1 (602 m²) et au R+3 (501 m²).\n\nCes étages sont rationnels, fonctionnels et lumineux.','BBBBB4.jpg','BBBBB3.jpg','BBBBB2.jpg','BBBBB1.jpg',49.2066,-0.595339,66000,'A louer',450,'Bureau les port Lucie','Audrieu',3,NULL,10,NULL,NULL,NULL),('BUREAU',16,'Place Bobigny, Hauts-de-France',_binary '','60150',NULL,'Au coeur du centre administratif de Bobigny, nous vous proposons à la location différentes surfaces de bureaux dans un immeuble récent et de standing. Excellente desserte!\n\nAu cœur du pôle tertiaire de la ZAC Jean Rostand à Bobigny, découvrez L’Européen, un immeuble récent de bon standing offrant des plateaux de bureaux climatisés, cloisonnés et câblés.\n\n \n\nSitué à proximité du Tribunal de Bobigny et 500m du métro \"Bobigny-Pablo Picasso\" sur la ligne 5, l’Européen est également relié à la gare de l\'Est par la ligne du RER E.','BBBB4.jpg','BBBB3.jpg','BBBB2.jpg','BBBB1.jpg',49.4648,2.88968,92000,'A louer',119,'Bureau a Bobigny','Le Plessis-Brion',0,NULL,0,NULL,NULL,NULL),('VILLA',17,'Rue d\'Arcachon, Occitanie',_binary '','31200',NULL,'COURBEVOIE - 3 PIÈCES - 66M2 - CAVE - PARKING - BALCON. La Villa 92 vous invite à découvrir ce charmant 3 pièces situé à proximité du métro1 la Défense. Au 2ème étage avec ascenseur d\'une copropriété sécurisée avec gardien, vous découvrirez une entrée, un grand séjour de 21 m2 lumineux et donnant sur un balcon de 8 m², une cuisine aménagée et équipée, deux chambres, un dressing, une salle de bains et WC séparé. Un parking et une cave complètent ce lot. Venez découvrir les nombreux atouts de ce bien avec des prestations qui enrichiront votre cadre de vie','VVVVV1.jpg','VVVVV2.jpg','VVVVV3.jpg','VVVVV4.jpg',43.6227,1.43882,19000,'A louer',200,'villa de luxe','Toulouse',2,NULL,NULL,NULL,8,NULL),('VILLA',18,'Pont du Carroussel, Île-de-France',_binary '','75001',NULL,'VILLENEUVE LA GARENNE - APOLLONIA - 4 PIÈCES DE 80,05 M2 - TERRASSE - PARKING - PARC DES CHANTERAINES -\nLa Villa 92 vous présente cet appartement familial en parfait état et aux multiples prestations.\nComposé d\'un espace de vie agréable avec cuisine ouverte toute équipée (avec notamment machine à café et cave à vin encastrées) et une terrasse de près de 10m2 vue sur Seine, ce bien vous invitera à profiter de moments paisibles et conviviaux.\nLes deux chambres enfants avec placards sont spacieuses et peuvent accueillir jusqu\'à deux couchages chacune.\nLa suite parentale, quant à elle, dispose de deux placards intégrés et de sa salle d\'eau.\nUne deuxième salle d\'eau avec son coin buanderie et rangements vont faciliter votre quotidien.\nEt des wc séparés avec lave-mains ainsi qu\'un dégagement avec étagères complètent ce bien créé sur-mesure pour vous !\nAutres atouts : fibre, local vélos et grande place de parking ! ','VVVV4.jpg','VVVV3.jpg','VVVV2.jpg','VVVV1.jpg',48.8593,2.33289,350000,'A louer',90,'villa en pleine ville','Paris',0,NULL,NULL,NULL,0,NULL),('TERRAIN',19,'Amiens rollin, Hauts-de-France',_binary '','80000',NULL,'Au calme, terrain plat à bâtir non viabilisé situé à 20 minutes de Montauban. Il est placé dans un environnement rural, ce qui plaira aux amoureux de la nature. Agence immo de cergy','TTTTT4.jpeg','TTTTT3.jpeg','TTTTT2.jpeg','TTTTT1.jpeg',49.8757,2.31232,35000,'A louer',100,'Terrain en vente','Amiens',NULL,NULL,NULL,NULL,NULL,NULL),('TERRAIN',20,'Rue du Bois d\'Agnetz, Hauts-de-France',_binary '','60600',NULL,'A RÉSERVER NOUVEAUTÉ Sur la commune d\'Agnetz hameau de Ronquerolles, dans lotissement au calme et au centre du village terrain à bâtir de 615m² avec une façade de 20,3 mètre, viabilisé en eau, électricité, tout à l\'égout et gaz. Libre choix constructeur. Proche des écoles et commerce de la commune. Accès proche nationale 31 et autoroute A1, CDG 45 minutes et paris nord 35 minutes par TER. ','TTTT4.jpeg','TTTT3.jpeg','TTTT2.jpeg','TTTT1.jpeg',49.3815,2.39216,174000,'A louer',500,'Terrain en campagne','Agnetz',NULL,NULL,NULL,NULL,NULL,NULL),('APPARTEMENT',21,'Le Ponceau, Île-de-France',_binary '','95000',NULL,'Une superbe EXCLUSIVITE, un gage de qualité.\nAppartement de 4 pièces comprenant : entrée, ensemble cuisine équipée ouverte sur séjour donnant sur terrasse de 60m² environ, cellier, dégagement, 3 chambres, salle de bains, wc, dressing. Cave et 2 places de parking privé en sous-sol.\nLiaison très aisée avec PARIS par le RER.','a1.jpeg','a2.jpeg','a3.jpeg','a4.jpeg',49.04,2.0702,8300,'A louer',56,'appartelent en location','Cergy',4,4,NULL,NULL,NULL,NULL),('BUREAU',22,'Cannes, Occitanie',_binary '','32100',NULL,'CHESSY – CBRE vous propose à l’acquisition plusieurs plateaux fonctionnels et lumineux à usage de bureaux, d’une surface totale de plus de 2 100 m² divisibles, dans un immeuble neuf et indépendant se trouvant au cœur d’un pôle tertiaire de qualité à Chessy.\n\nBonne situation géographique du bien, au pied du RER A « Val d’Europe » et à proximité immédiate de toutes commodités.\n\n. Restauration à proximité\n. Contrôle d\'accès\n. Ascenseur sécurisé\n. Climatisation double flux\n. Espace paysagé\n. Décoration : faux plafond et moquette\n. Places de parking privatives en sous-sol\n. Divisible par deux par plateaux\n. Local vélo de 58,10 m²\n. Etat : Neuf\n\nDPE :\n[IDS_PROPERTY_DPE_TEXT] ','b1.jpg','b2.jpg','b3.jpg','b4.jpg',44.0053,0.368184,15000,'A louer',300,'Bureau en location en centre ville','Condom',1,NULL,8,NULL,NULL,NULL),('VILLA',23,'Place des Quinconces, Nouvelle-Aquitaine',_binary '','33000',NULL,'A 30 minutes du centre de Bordeaux, château classé ISMH, totalisant environ 1 200 m2 habitables et situé en surplomb des bois et vignes. Le logis, d\'environ 650 m2 se compose de splendides pièces de réception et 5 chambres. 2 appartements indépendants et des communs complètent ce bien. L\'ensemble propose de nombreuses perspectives de valorisation et touristiques. Offrant une vue dégagée et un calme absolu, le parc de 6 ha se compose d\'une cour bordée d\'une colonnade, d\'un étang, de prairies et de 2.5 ha de vignes AOC en 1ères côtes de Bordeaux. ','v4.jpeg','v3.jpeg','v2.jpeg','v1.jpeg',44.8454,-0.57603,140000,'A louer',80,'villa en centre ville Bordeaux','Bordeaux',6,NULL,NULL,NULL,12,NULL),('TERRAIN',24,'Port de la Rochelle, Île-de-France',_binary '','78990',NULL,'vous propose: A 5 MN d\'AIGREFEUILLE, SUR LA COMMUNE DE PUYDROUARD, Terrain de 544 m² environ, non viabilisé.(Le géomètre passera dès qu\'il y aura un acquéreur potentiel).\n\nSecteur calme.\n\n(Terrain de 456 m² environ disponible aussi).\n\nA DÉCOUVRIR RAPIDEMENT\n\nHonoraires d\'agence à la charge du vendeur. Bien non soumis au DPE. La présente annonce immobilière a été rédigée sous la responsabilité éditoriale de Mlle Isabelle GUEGUEN (ID 43705)','t1.jpg','t2.jpg','t3.jpg','t4.jpg',48.7763,1.96101,95000,'A louer',500,'Terrain en vente','Élancourt',NULL,NULL,NULL,NULL,NULL,NULL),('APPARTEMENT',25,'Passage du 51 Av Adolphe Schneider, Île-de-France',_binary '','92140','2021-01-07 19:32:22.950000','jwiejijrwgiwjigjijgih3ghj','A1.jpg','AAA1.jpg','AAA2.jpg','AA4.jpg',48.8065,2.2538,8778,'A louer',484,'kqjofijw','Clamart',4,4,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `bien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `type_client` varchar(15) NOT NULL,
  `id` varchar(255) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `code_postal` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `num_tel` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `secteur_actity` varchar(255) DEFAULT NULL,
  `siret` varchar(255) DEFAULT NULL,
  `type_entreprise` varchar(255) DEFAULT NULL,
  `cni` varchar(255) DEFAULT NULL,
  `date_naiss` datetime(6) DEFAULT NULL,
  `sexe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES ('PARTICULIER','0d9cedbc-c563-4d2e-9622-4fbf7233d5f2',NULL,NULL,'momaththiam2012@gmail.com','Thiam',NULL,'Momath',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('PARTICULIER','157c5882-b4e6-47e5-9d5c-e2447f204d7a',NULL,NULL,'abdouazizdiouf75@gmail.com','tata',NULL,'Toto',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('PARTICULIER','59dd3108-d824-4014-b2f0-8d604d8afcc7',NULL,NULL,'kemokaba@gmail.com','diaite',NULL,'kemo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('PARTICULIER','64aa1d11-133f-448a-b9d7-61eb3779459b',NULL,'','ziz.dev.compte@gmail.com','DIOUF',NULL,'Abdou Aziz',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('PARTICULIER','8a33315e-928f-4b2c-8587-e8b830a052f7',NULL,NULL,'dkankreo@gmail.com','dourwe',NULL,'kankreo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('PARTICULIER','e1f470c2-a4c8-4ee7-8f47-dd93da05e706',NULL,NULL,'abdouazizdiouf75@gmail.com','DIOUF',NULL,'Abdou Aziz',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('PARTICULIER','f8b361f8-e0b0-4d33-af11-ea701bb0f943',NULL,NULL,'chinsanity16@gmail.com','ndiaye7788',NULL,'cherif',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contrat_client_bien`
--

DROP TABLE IF EXISTS `contrat_client_bien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contrat_client_bien` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_debut` datetime(6) DEFAULT NULL,
  `date_fin` datetime(6) DEFAULT NULL,
  `description` longtext,
  `est_retenue` bit(1) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `bien_id` bigint DEFAULT NULL,
  `client_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKatpxguvhudst9oyi1k10xq9c3` (`bien_id`),
  KEY `FKmr92cat6gbw3lqey34283t0hb` (`client_id`),
  CONSTRAINT `FKatpxguvhudst9oyi1k10xq9c3` FOREIGN KEY (`bien_id`) REFERENCES `bien` (`id`),
  CONSTRAINT `FKmr92cat6gbw3lqey34283t0hb` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrat_client_bien`
--

LOCK TABLES `contrat_client_bien` WRITE;
/*!40000 ALTER TABLE `contrat_client_bien` DISABLE KEYS */;
INSERT INTO `contrat_client_bien` VALUES (16,'2021-01-07 16:43:27.138000','2022-01-08 13:00:57.000000',NULL,_binary '','location',2,'157c5882-b4e6-47e5-9d5c-e2447f204d7a'),(28,'2021-01-08 12:03:43.706000',NULL,NULL,_binary '','location',2,'e1f470c2-a4c8-4ee7-8f47-dd93da05e706'),(29,'2021-01-08 15:32:47.755000',NULL,NULL,_binary '','location',9,'8a33315e-928f-4b2c-8587-e8b830a052f7'),(30,'2021-01-08 15:37:56.417000',NULL,NULL,_binary '','location',13,'e1f470c2-a4c8-4ee7-8f47-dd93da05e706'),(31,'2021-01-08 17:11:49.389000',NULL,NULL,_binary '','ventes',1,'e1f470c2-a4c8-4ee7-8f47-dd93da05e706'),(32,'2021-01-09 17:11:59.260000',NULL,NULL,_binary '','location',14,'59dd3108-d824-4014-b2f0-8d604d8afcc7'),(33,'2021-01-10 21:02:06.760000',NULL,NULL,_binary '','location',4,'0d9cedbc-c563-4d2e-9622-4fbf7233d5f2'),(34,'2021-01-13 23:00:39.696000',NULL,NULL,_binary '','location',3,'f8b361f8-e0b0-4d33-af11-ea701bb0f943');
/*!40000 ALTER TABLE `contrat_client_bien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email_sender`
--

DROP TABLE IF EXISTS `email_sender`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `email_sender` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `body` longtext,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email_sender`
--

LOCK TABLES `email_sender` WRITE;
/*!40000 ALTER TABLE `email_sender` DISABLE KEYS */;
INSERT INTO `email_sender` VALUES (21,'blablabla','abdouazizdiouf75@gmail.com','Abdou Aziz','DIOUF','test'),(37,'cc ver eoesjl  frkqj fjzkzlls frjjjdh fhhhf oood dhdol','kemokaba@gmail.com','Kemo','DIAITE','renseignement');
/*!40000 ALTER TABLE `email_sender` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paiement`
--

DROP TABLE IF EXISTS `paiement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paiement` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_paiement` datetime(6) DEFAULT NULL,
  `est_acceptee` bit(1) NOT NULL,
  `moyen_paiement` varchar(255) DEFAULT NULL,
  `contrat_client_bien_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKd2ydmk4c420afj382llxsajkb` (`contrat_client_bien_id`),
  CONSTRAINT `FKd2ydmk4c420afj382llxsajkb` FOREIGN KEY (`contrat_client_bien_id`) REFERENCES `contrat_client_bien` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paiement`
--

LOCK TABLES `paiement` WRITE;
/*!40000 ALTER TABLE `paiement` DISABLE KEYS */;
/*!40000 ALTER TABLE `paiement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projet`
--

DROP TABLE IF EXISTS `projet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projet` (
  `id` bigint NOT NULL,
  `date_debut` datetime(6) DEFAULT NULL,
  `date_fin` datetime(6) DEFAULT NULL,
  `description` longtext,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projet`
--

LOCK TABLES `projet` WRITE;
/*!40000 ALTER TABLE `projet` DISABLE KEYS */;
/*!40000 ALTER TABLE `projet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `profile` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;