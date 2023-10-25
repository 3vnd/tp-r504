
# Nom du réseau à créer
network_name="net-tp4"

# Vérifier si le réseau existe déjà
if [ -z "$(docker network ls -q -f name=${network_name})" ]; then
  # Créer le réseau de type bridge
  docker network create --driver bridge ${network_name}
  echo "Réseau ${network_name} créé avec succès."
else
  echo "Le réseau ${network_name} existe déjà."
fi

if [ $? !=0 ]
then
	echo"erreur"
		exit
fi
