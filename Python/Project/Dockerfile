FROM python:3.9-slim
WORKDIR /app
ARG APP_FILE
COPY ${APP_FILE}.py .
ENV APP_FILE=${APP_FILE}
CMD ["sh", "-c", "python ${APP_FILE}.py"]
