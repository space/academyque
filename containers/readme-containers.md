
# Inizio

docker ps -a
docker rm ...

docker images
docker images rm ...

docker run --name my-hello-world-container hello-world:latest

docker run -it ubuntu bash

# Descrizione della segregazione via namespace

https://en.wikipedia.org/wiki/Linux_namespaces#Namespace_kinds

https://medium.com/@kasunmaduraeng/docker-namespace-and-cgroups-dece27c209c7#:~:text=Docker%20uses%20namespaces%20of%20various,Process%20ID

# Esempio per docker compose

https://hub.docker.com/r/bitnami/redmine

https://github.com/bitnami/bitnami-docker-redmine/blob/master/docker-compose.yml

curl -sSL https://raw.githubusercontent.com/bitnami/bitnami-docker-redmine/master/docker-compose.yml > docker-compose.yml

docker-compose up -d

# Installazione di PORTAINER

docker volume create portainer_data

docker run -d -p 8000:8000 -p 9000:9000 --name=my-portainer-container --restart=always -v /var/run/docker.sock:/var/run/docker.sock -v portainer_data:/data portainer/portainer-ce

http://localhost:9000/

admin / password123
