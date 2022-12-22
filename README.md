<h1>les MicroServices(CustomerService- ProductService- BillingService) avec Angular</h1>
<br><br>
<h1>1-Le micro-service customer-service qui permet de gérer les client</h1>
<img width="521" alt="image" src="https://user-images.githubusercontent.com/85077579/209123206-7eeb32b0-6ba5-44af-9f0b-74bd4dece9ae.png">
<h2>pour afficher chaque client</h2>
<img width="392" alt="image" src="https://user-images.githubusercontent.com/85077579/209123263-f4c6619d-b72d-4e17-a088-d56229dedde3.png">
<h1>2-le micro-service inventory-service qui permet de gérer les produits</h1>
<img width="499" alt="image" src="https://user-images.githubusercontent.com/85077579/209123431-3c85b09c-35a6-45c7-8e6b-107d2f76f245.png">
<h2>pour afficher chaque produit</h2>
<img width="353" alt="image" src="https://user-images.githubusercontent.com/85077579/209123736-650bdd2e-68ee-4b7a-a26b-bbc513801ca4.png">
<h1>3-la Gateway Spring cloud Gateway avec une Configuration statique du système de routage</h1>
<img width="500" alt="image" src="https://user-images.githubusercontent.com/85077579/209144960-ef2b625d-db47-42a6-987e-28167e7d71a3.png">

<h1>4-l'annuaire Eureka Discrovery Service</h1>
<img width="872" alt="image" src="https://user-images.githubusercontent.com/85077579/209126098-69272901-c10c-4078-89c2-7d35f56337ec.png">
<h1>5- dynamique des routes de la gateway</h1>
<img width="723" alt="image" src="https://user-images.githubusercontent.com/85077579/209145166-335ce761-2039-4d17-bc73-a9864dad322d.png">
<h3>on peut acceder au différent services comme suit: </h3>
<h4>Product service:  </h4>

<img width="497" alt="image" src="https://user-images.githubusercontent.com/85077579/209153824-9451c026-09ae-49a6-aa53-f07246dbdc73.png">
<h4>Customer service:  </h4>
<img width="473" alt="image" src="https://user-images.githubusercontent.com/85077579/209154222-8a1e7eb4-6d93-4a51-b5c6-74759544f63b.png">

<h1> 6-Billing-Service</h1>
<h3>On a créer d'abord des classes service on utilisant l'annotation Feign client pour lier les service inventoty et customer</h3>
<img width="383" alt="image" src="https://user-images.githubusercontent.com/85077579/209152686-0687f091-971d-43e6-9e57-7a7cd22f9213.png">

<img width="407" alt="image" src="https://user-images.githubusercontent.com/85077579/209152326-04531f8a-ba8f-465f-892d-2472c5dc7ef3.png">


<h2>Microservice Billing service</h2>
<img width="447" alt="image" src="https://user-images.githubusercontent.com/85077579/209126878-aeb65940-9bf7-489c-974f-9801c0ec06f3.png">
<h2>voir une seule facture</h2>



<img width="909" alt="image" src="https://user-images.githubusercontent.com/85077579/209150569-8cadcbee-5ae4-4a72-ba3c-c88506cc983b.png">
<br><br>
<br>
<h1> Frontend en utilisant Angular</h1>
<h2>Liaison Frontend et backend</h2>
<h3>On va ajouter dans la gateway ceci pour donner la permission au port du frontend(4200)</h3>
<img width="457" alt="image" src="https://user-images.githubusercontent.com/85077579/209156980-0d970655-f302-483c-8cb2-ee8a4e368402.png">
<h3>Par la suite on va ajouter les controlleur et les services dans chaque service</h3>
<h4>Service</h4>
<img width="411" alt="image" src="https://user-images.githubusercontent.com/85077579/209158626-4d95716d-e688-4544-9868-2000968c0b46.png">
<h4>Controller</h4>
<img width="560" alt="image" src="https://user-images.githubusercontent.com/85077579/209158804-8d01ac83-3974-436d-8983-1a04aac21690.png">
<br>
<h2>Interface</h2>
<h3>Interface Client</h3>
<h4>On peut supprimer un client et l'ajouter ou bien voir ses factures</h4>
<img width="926" alt="image" src="https://user-images.githubusercontent.com/85077579/209159524-922b1245-d365-44e3-b084-5aedd3567e59.png">
<h3>Interface Produit</h3>
<h4>On peut supprimer un produit et l'ajouter </h4>
<img width="953" alt="image" src="https://user-images.githubusercontent.com/85077579/209160622-0be74d38-0ca4-4787-8d84-a134a144dfb1.png">
<h3>Interface Facture</h3>
<h4>On peut ajouter les factures on selectienent le client et les produit </h4>
<img width="926" alt="image" src="https://user-images.githubusercontent.com/85077579/209160774-0c865ccf-149a-4d99-963f-52481803312d.png">
<h3>Bill Detail</h3>
<h4>quand on clique sur la bouton bill details qui se trouve dans l'interface client on va se rediriger vers cette interface </h4>
<img width="944" alt="image" src="https://user-images.githubusercontent.com/85077579/209161523-8b767686-c830-445b-a5c4-14841bae5934.png">
<h4>cette interface nous donne plus d'informations sue la commande avec le total ainsi que les différents informations du client </h4>
<img width="938" alt="image" src="https://user-images.githubusercontent.com/85077579/209162072-4c004d8e-67d1-4d12-ba96-ec7c3e41e088.png">



