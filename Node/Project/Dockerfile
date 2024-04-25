FROM node:lts-alpine3.19
WORKDIR /app-money
COPY --chown=node:node package*.json ./
USER root
RUN chown -R node:node /app-money
USER node
RUN npm install
COPY --chown=node:node . .
EXPOSE 3000
CMD ["npm", "start"]
