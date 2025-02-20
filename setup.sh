echo "build image"
docker build . -t dummyjson
echo "uploading aplication"
docker compose up -d
