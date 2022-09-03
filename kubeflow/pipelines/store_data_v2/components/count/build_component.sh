#!/usr/bin/env bash

IMAGE_NAME=${1:-kf_count_word}
IMAGE_TAG=${2:-1.0.0}
DOCKER_REGISTRY=${3:-docker.io/in92}

IMAGE_LOCAL="$IMAGE_NAME:$IMAGE_TAG"
IMAGE_REMOTE="$DOCKER_REGISTRY/$IMAGE_NAME:$IMAGE_TAG"

docker build -t "$IMAGE_LOCAL" .
docker tag  "$IMAGE_LOCAL" "$IMAGE_REMOTE"
docker push "$IMAGE_REMOTE"