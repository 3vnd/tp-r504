

# Stopper les conteneurs
docker stop $(docker ps -q)

# Supprimer les conteneurs
docker rm -f $(docker ps -aq)

# Supprimer les réseaux
docker network prune -f

# Supprimer les volumes 
docker volume prune -f
